package ch08.unit03;

public class Ex02 {
	public static void main(String[] args) {
		//up-casting
		Test2 t = new Demo2();//객체의 다형성
		
		//up-casting
		// : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		// : up-casting은 언제나 가능
		// : 형변환을 하지 않아도 된다.
		
		//down-casting
		// : up-casting 한 객체를 다시 원래 객체로 캐스팅하는 것
		// : down-casting은 up-casting 한 객체만 가능하다.
		// : down-casting은 반드시 강제 캐스팅 해야 한다.
		
		//Demo2 d = t;//컴파일 에러. 반드시 다운캐스팅은 강제 캐스팅 해야 함
		Demo2 d = (Demo2)t;
		d.write();
		
		//(Demo2)t.write();//컴파일 에러,()보다 .이 우선 순위가 높은
		((Demo2)t).write();//다운 캐스팅
		System.out.println();
		
		/*
		Test2 tt = new Test2();
	    Demo2 dd = (Demo2)tt;//런타임에러.ClassCastException
	         //다운 캐스팅은 업 캐스팅 한것만 가능하다.
	    dd.disp();*/
	}

}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+","+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
	
}

class Demo2 extends Test2{
	int b =100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println(a+","+super.b+","+b+","+c);
	}
	
	public void write() {
		System.out.println("write");
	}
}