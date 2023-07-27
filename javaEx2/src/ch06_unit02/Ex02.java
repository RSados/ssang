package ch06_unit02;

public class Ex02 {
	public static void main(String[] args) {
		int x;//일반변수. 메소드 안에서 선언한 변수
	    //System.out.println(x);//컴오류.초기화가 되어 있지 않음
		x=10;
		System.out.println("x:"+x);
		
		//객체
		//1)레퍼런스 변수 선언(객체 선언)
		Test2 t1;
		//t1.a = 10;//컴오류 객체가 초기화 되어 있지 않음
		
		//2) 객체 생성 (메모리 할당)
		//객체 = new 생성자();
		//생성자는 객체를 생성할 때 new 다음에 기술한다
		t1= new Test2();//생성자 이름은 클래스 이름과 동일
		
		//3) 객체 사용
		//.연산자를 이용하여 필드나 메소드를 접근
		//객체명.필드
		//객체명.메소드명()
		System.out.println(t1.name+":"+t1.a+":"+t1.b);
		  //null:0:10
		t1.name="홍길동";
		t1.a=20;
		System.out.println(t1.name+":"+t1.a+":"+t1.b);
		//홍길동:20:10
		
		t1.name="이자바";
		t1.disp();//메소드 호출
		//이자바,20,10
		
		//Test2 t2 =null;//null로 초기화. 메모리가 할당되지 않은 상태
		//t2.name="오라클";//런타임 에러. 메모리가 할당되지 않은 상태이므로 
		
		//객체 생성과 동시에 메모리 할당
		
		
		Test2 t2 =new Test2();
		t2.disp();//null,0,10
		
	}
	
	int n;//필드

}




//클래스 :데이터(필드)+기능(메소드)로 구성
class Test2 {
	//필드 선언(인스턴스 초기화)
	//필드는 초기화 하지 않으면 객체가 생성되는 시점에 객채는 null,숫자변수는 0으로 초기화
	String name;//객체가 생성될때 null로 초기화
	int a;//객체가 생성될때 0으로 초기화
	int b=10;//객체가 생성될때 10으로 초기화
	
//    System.out.println(a);//컴오류 선언부에는 실행문이 올수 없엄

//메소드(인스턴스 메소드)
	public void disp() {
		System.out.println(name+","+a+","+b);
	}
}