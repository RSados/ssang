package ch08.unit03;

public class Ex05_instanceof {
	public static void main(String[] args) {
		//Object > Test5 > Demo5
		Test5 t1 = new Test5();
		t1.print(); // 10, 20
		t1.sub();//10, 20
		
		//up - casting : 언제나 가능
		Test5 t2 = new Demo5();//up - casting
		Demo5 d1 = new Demo5();
		Test5 t3=d1;//up - casting
	    Object o = new Demo5();//up - casting
		
		System.out.println(t2.b);//20 , Test5 필드
		System.out.println(t3.b);//20 , Test5 필드
		     //필드는 무조건 자신것
		//System.out.println(t2.c);//컴파일 에러
		System.out.println(((Demo5)t2).c);//200,반드시 다운캐스팅 해야함
		System.out.println(((Demo5)o).c);//200, 다운캐스팅
		System.out.println(((Test5)o).b);//20, 다운캐스팅
		System.out.println(((Demo5)o).b);//100,다운캐스팅
		System.out.println();
		
		t2.print();//Demo5 것 출력.override 된 경우 상위 클래스 메소드는 숨는다.
		//10:20:100:200
		t2.sub();
		//10:20:100:200
		//t2.write();//컴파일 오류
		
		//down - casting: 업한것만 다운 가능 , 반드시 캐스팅 해야함
		System.out.println();
		((Demo5)t2).write();//다운 캐스팅
		
		//((Demo5)t1).write();//런타임 에러 업한것만 다운 가능//ClassCastException
		
		System.out.println(t1);//ch08.unit03.Test5@1e643faf
		System.out.println(t2);//ch08.unit03.Demo5@6e8dacdf
		
		System.out.println(t1 instanceof Demo5);//false
		System.out.println(t2 instanceof Demo5);//true
		      //instanceof : 객체가 해당 클래스의 객체이면 true 반환
		
		if(t1 instanceof Demo5) {
			Demo5 dd = (Demo5)t1;
			System.out.println("t1...");
			dd.write();
		}
		
		if(t2 instanceof Demo5) {
			Demo5 dd = (Demo5)t2;
			System.out.println("t2...");
			dd.write();
		}
		
		
	}
}

class Test5 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+","+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
	
	public void sub() {
		print();
	}
}

class Demo5 extends Test5 {
	int b= 100;
	int c= 200;
	
	public void print() {
		System.out.println(a+":"+super.b+":"+b+":"+c);
	}
	
	public void write() {
		System.out.println("write...");
	}
}