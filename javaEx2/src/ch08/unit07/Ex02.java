package ch08.unit07;

public class Ex02 {
	public static void main(String[] args) {
		//Test2.User2 obj = new Test2.User2();//컴오류
		
		Test2 t = new Test2();
		
		Test2.User2 obj = t.new User2();
		obj.write();
	}
}

class Test2 {
	int a =10;
	static int b =20;
	
	//내부 클래스 : 외부 클래스(test2) 객체가 생성되어야 객체를 생성할 수 있는 클래스
	class User2{
		int x =100;
		
		public void write() {
			System.out.println(a+","+b+","+x);
			
			//print();
		}
	}
	
	public void print() {
		System.out.println(a+","+b);
	}
	
	public void sub() {
		//일반적으로 메소드 내에서 내부클래스의 객체를 생성하여 활용
		User2 u = new User2();
		u.write();
	}
}