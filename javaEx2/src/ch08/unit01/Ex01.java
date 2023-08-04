package ch08.unit01;

public class Ex01 {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		// 하위 객체로 상위 클래스 멤버 접근
		System.out.println(obj.b);
		obj.print();
		
		obj.disp();
	}
}

class Test1 {// 상위 클래스 :Object
	private int a= 10; // 자신의 클래스에서만 접근 가능. 하위 클래스도 접근 불가
	int b =20; // 동일한 패키지에서 접근 가능
	protected int c =30; // 동일 패키지 및 하위 클래스에서 접근 가능
	public int d = 40; // 모두 접근 가능
	
	public void print() {
		System.out.println(a+":"+b+":"+c+":"+d);
	}
}

//상속 : 자바는 단일 상속만 지원
//Test1 : Super 클래스(상위 클래스)
//Demo1 : sub 클래스 (하위 클래스)
class Demo1 extends Test1 {
	int x = 100;
	
	public void disp() {
		//System.out.println(a);// private는 하위 클래스도 접근 불가
		System.out.println("상위에서 물려 받은것 : "+b+":"+c+":"+d);
		System.out.println("x:"+x);
	}
	
	public void write() {
		print();//상위 클래스의 메소드 호출
	}
}

