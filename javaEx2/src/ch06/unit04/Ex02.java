package ch06.unit04;

public class Ex02 {
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.disp();
		
		//Demo2 d = new Demo2();//컴파일 오류.인자가 없는 생성자가 없음 //인자가 없는놈이 있으면 오류 안뜸
		Demo2 d = new Demo2(200);
		d.write();	}
}

class Test2{
	private int a= 5;
	
	//생성자가 없으면 자바는 컴파일 할때 아래처럼 아무 코드도 없는 디폴트 생성자를 만든다.
	//public Test2() {}
	
	public void disp() {
		System.out.println("a: "+a);
	}
}

class Demo2{
	private int a;
	
	//생성자가 존재하면 자바는 디폴트 생성자를 만들지 않는다.
	public Demo2(int x) {
		
	
		a=x;
		System.out.println("인자가 하나인 생성자");
	}
	public void write() {
		System.out.println(a);
	}
}