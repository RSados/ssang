package ch08.unit03;

public class Ex03 {
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		
		// up-casting
		Test3 t2 = new Sample3();
		Test3 t3 = new Demo3();
		Sample3 t4 = new Sample3();
		
		t1.disp();//Test3 print....
		t2.disp();//Sample3 print...
		t3.disp();//Test3 print...
		t4 = (Sample3)t2;
		t2.disp();
		t4.disp();
		
	}
}

class Test3{
	public void print() {
		System.out.println("Test3 print...");
	}
	
	public void disp() {
		print();//상위클래스는 하위클래스의 메소드를 쓸방법은 없지만 업캐스팅+해당메소드가 재정의 되어있다면 상위클래스에서 호출 가능
		//write();//컴파일오류
	}
}

class Sample3 extends Test3{
	@Override
	public void print() {
		System.out.println("Sample3 print...");
	}
	
	public void write() {
		System.out.println("Sample3 write...");
	}
}

class Demo3 extends Test3{
	public void sub() {
		System.out.println("Demo3 sub...");
	}
}