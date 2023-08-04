package ch08.unit02;

public class Ex01 {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.disp();
		
		d.write();
	}
}

class Test1{
	int a = 10;
	
	public void disp() {
		System.out.println("a:"+a);
	}
}

class Demo1 extends Test1{
	int x = 100;
	
	//컴파일 오류.override 규칙 위반
	//메소드의 이름, 리턴타입, 파라미터 개수 및 타입이 일치해야함
    /*
	public int disp() {
		return 0;
	}*/
	
	//컴파일 오류.override는 접근제어자가 크거나 같아야 한다.
	/*
	protected void disp() {
		
	}*/
	
	//재정의(override) : 상위 클래스의 메소드를 재정의
	//상위 클래스의 메소드를 재정의 하면 재정의 된 상위 클래스의 메소드는 숨는다.
	@Override //메소드가 override 규칙에 맞는지를 검증하고 틀리면 에러 발생
	public void disp() {
		System.out.println("a:"+a+",x:"+x);
	}
	
	//중복정의(overloading)
	public void disp(int n) {
		System.out.println(n);
	}
	
	public void write() {
		//disp();   //Demo1 클래스의 disp()호출
		super.disp();// Test1 클래스의 disp() 호출
	}
}




