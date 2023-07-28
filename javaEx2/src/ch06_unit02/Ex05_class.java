package ch06_unit02;

public class Ex05_class {
	public static void main(String[] args) {
		//클래스 변수 사용: 클래스 변수는 클래스 이름으로 접근
	    System.out.println(Test5.c);//20
	    //System.out.println(Test5.a);//에러
	    //인스턴스변수는 클래스 이름으로 접근불가
	    
		//레퍼런스 변수 선언
		Test5 t1;// 메모리를 할당 받지 않은 상태
		t1 = new Test5();
		     //객체가 메모리 할당을 받음.필드 a,b가 메모리 할당을 받음
		
		Test5 t2 = new Test5();
		     //객체가 메모리 할당을 받음.필드 a,b가 메모리 할당을 받음
		
		t1.a=100;
		
		System.out.println(t1.a+":"+t2.a);//100.0
		
		//System.out.println(t1.b);//컴파일 에러 privte는 외부에서 잡근 불사
		t1.disp();
	}

}

class Test5{
	//필드 :인스턴스 변수+클래스 변수

    //인스턴스 변수: 객체를 생성해야 접근할 수 있는 변수
	//          :객체가 생성되는 개수만큼 메모리를 할당 받음
	int a;           // : 동일한 패키지 안에서만 접근 가능
	private int b=10;//private : 동일한 클래스만 접근 가능
	
	//클래스 변수: 클래스가 메모리에 로딩되는 순간 메모리를 할당 받는 변수
	//         : 객체 생성과 상관 없이 접근할 수 이다.
	//         :클래스 변수는 객체와 상관 없이 한번만 메모리 할당을 받음
	public static int c=20;//public : 어디에서나 접근 가능
	
	public void disp() {
		System.out.println(a+":"+b+":"+c);
	}
	
	
	
	
}






