package ch06.unit04;

/*
 - 객체 생성 과정 
   1) 객체의 메모리 할당 : 인스턴스 변수의 메모리 할당
      a 필드가 heap 영역에 메모리 할당
   2) a 필드는 디폴트 값(0)으로 초기화
   3)생성자의 몸체를 실행하여 a 필드는 10으로 초기화
     생성자는 객체가 생성될때 한번만 실행(객체당 한번씩만)
 */
public class Ex01_constructor {
	public static void main(String[] args) {
		Test1 obj = new Test1();
		
		obj.disp();

	}
}

class Test1 {
	private int a;

	// 인자가 없는 생성자
	public Test1() {
		a = 10; // 인스턴스 변수 초기화
		System.out.println("생성자...");
	}

	public void disp() {
		// Test1();//컴파일 오류.생성자는 일반 메소드 처럼 호출 불가
		System.out.println("a : " + a);
	}
}