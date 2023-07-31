package ch06.unit04;

public class Ex09_initalize {
	public static void main(String[] args) {
		Test9 t1 = new Test9();
		t1.disp();
		
		Test9.x+=100;
		
		Test9 t2 = new Test9();
		t2.disp();
	}

}
/*
 -클래스가 로딩될때 한번 실행
 1) 클래스 변수 메모리 할당 - 메소드 영역 - 메소드 영역에 메모리 할당
 2) 클래스 변수를 디폴트 값으로 초기화
 3) 초기화 변수 수식 실행
 4) static 초기화 블럭 실행
 
 -객체를 생성할때마다 실행
 1) new Test9(); - 객체를 위한 메모리 할당(인스턴스 변수 메모리 할당):a,b,c,d
    heap 메모리 영역에 메모리 할당
 2) 모든 인스턴스 변수 디폴트값으로 초기화 : a<-0, b<-0, c<-0, d<-0
 3) 초기화 수식으로 초기화(존재하는 경우) : b<-1;
 4) 초기화 블럭실행(존재하는 경우)
 5) 생성자 몸체 실행
   (1) 생성자 몸체의 첫라인의 super([인수]); 또는 this([인수]); 실행
   (2) 생성자 몸체 실행
 
 */

class Test9 {
	private int a;
	private int b=1;
	private int c;
	private int d;
	
	public static int x =10;
	private static int y;
	
	static {// static 초기화 블럭. 단 한번만 실행
		y=20;
		System.out.println("static 초기화 블럭...");
	}
	
	{// 초기화 블럭. 객체 생성할때 마다 실행
		d=5;
		System.out.println("초기화 블럭...");
	}
	
	public Test9() {
		// super(); // 생략된거임. this가 없으면 자동으로 넣어줌
		c=10;
		System.out.println("생성자...");
	}
	
	public void disp() {
		System.out.println(a+","+b+","+c+","+d);
		System.out.println(x+":"+y);
	}
	
	
	
	
	
	
	
	
	
	
	
}