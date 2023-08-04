package ch08.unit03;

public class Ex01 {
	public static void main(String[] args) {
		// 클래스는 상속관계가 아니면 어떠한 경우에도 형변환이 불가능하다.
		/*
		Integer a=10;
		Long b;
		//b=a;// 컴오류
		 b= (Long) a;//컴오류
		 */
		
		Test1 t = new Test1();
		t.print();
		//System.out.println(t.c);//컴오류. 하위클래스 멤버 접근 불가
		System.out.println();
		
		//Object > Test1(상위클래스) > Demo1(하위클래스)
		//up - casting
		// : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		// : up casting은 언제나 가능
		// : 형변환을 하지 않아도 된다.
		
		Demo1 d =new Demo1();
		Test1 t1 = d;// up-casting. 실행 시점에
		//Object o = d;// up-casting
		
		System.out.println(d==t1);// 동일한 주소를 참조하므로 true
		
		System.out.println(d.b);//100
		System.out.println(t1.b);//20
		     //업캐스팅한 객체라 할지라도 필드는 자기 자신을 나타냄
		//System.out.println(t1.c);// 컴파일 오류
		     //Test 1 클래스에는 c라는 필드가 없음
		
		//업캐스팅 객체에서 재정의된 메소드를 호출하면 상위 클래스의 메소드는
		//  숨어버리기 때문에 하위 클래스의 메소드가 호출된다.
		//업캐스팅 객체로 Test1 클래스의 print() 메소드를 호출할 수 있는
		//  방법은 없다.
		t1.print();
		System.out.println();
		
		t1.disp();
		
		//t1이 업캐스팅된 객체이지만 Test1 클래스에 write() 메소드가 없으므로
		//   컴파일 오류
		//t,write();
		
		d.write();
		
		
		
	}
}

class Test1{
	int a=10;
	int b= 20;
	
	public void print() {
		System.out.println(a+","+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo1 extends Test1{
	int b= 100;
	int c= 200;
	
	@Override
	public void print() {
		System.out.println("a:"+a+",b:"+b+",super.b"+super.b+",c:"+c);
	}
	
	public void write() {
		print();
		super.print();
		disp();
		
	}
	
	
}