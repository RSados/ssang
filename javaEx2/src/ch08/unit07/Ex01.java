package ch08.unit07;

public class Ex01 {
	public static void main(String[] args) {
		//User1 obj = new User1();//컴오류
		
		//외부에서 static 중첩 클래스 객체 생성
		Test1.User1 obj = new Test1.User1();
		obj.write();
	}

}

class Test1 {
	int a = 10;
	static int b = 20;
	
	//static 중첩 클래스 : 외부 클래스(Test1)의 객체 생성과 상관 없이 사용할 수 있는 클래스
	//컴파일하면 Test1$User1.class 파일이 생성
	static class User1{
		int x =100;
		
		public void write() {
			//System.out.println(a);//컴오류
		    System.out.println(b);
		}
		
		public void disp() {	
			Test1 t = new Test1();
			System.out.println(t.a);
			t.print();
		}
	}
	
	public void print() {
		System.out.println(a+","+b);
	}
	
	public static void sub() {
		//System.out.println(a);//컴오류
		System.out.println(b);
	}
}