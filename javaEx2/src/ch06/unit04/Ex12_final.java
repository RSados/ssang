package ch06.unit04;

public class Ex12_final {
	public static void main(String[] args) {
		//Test12.PI=3.14;//컴파일 에러. 변경불가
	}

}

class Test12 {
	public static final double PI=3.141592; // 상수. 
	           //final : 변수선언과 동시에 초기화
	           //      : 값 변경 불가
	//public static final int x;//에러 초기화를 안했음
	public static final int m;
	static {
		m=10;//static final 변수는 static초기화 블럭에서 초기화 가능
	}
	
	
	//인스턴스 final변수
	public final int a;
	
	public Test12() {
		//인스턴스 final변수는 생성자에서 초기화 가능
		a = 10;
		
	}
}