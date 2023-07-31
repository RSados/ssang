package ch06.unit04;

public class Ex08 {
	public static void main(String[] args) {
		
	}

}

class Test8{
	private int a;             // 인스턴스 변수
	private static int b=10;   // 클래스 변수 
	
	public void set(int a) {   // 인스턴스 메소드
		this.a =a;
	}
	
	public void print() {      // 인스턴스 메소드
		//인스턴스 변수 사용 가능, 다른 인스턴스 메소드 호출 가능
		//클래스 변수 사용 가능, 클래스 메소드 호출 가능
		System.out.println("a:"+this.a+",b:"+Test8.b);
	}
	
	public static void sub(int b) {// 클래스 메소드
		//인스턴스 변수 사용 불가, 다른 인스턴스 메소드 호출 불가능
		//클래스 변수 사용 가능, 클래스 메소드 호출 가능
		//a=10;//컴오류
		
		//b=b+10;//매개변수값 10증가
		
		//this.b=b+10;//컴파일 에러. 클래스 메소드는 this 사용 불가
		//클래스변수, 클래스 메소드는 객체 생성과 무관하다.
		Test8.b = b=10;//'클래스' 변수니깐 '클래스' 명을 붙혀서 특정가능
		//'클래스'명이기에 인스턴스 변수에는 사용불가
		
		

	}
}