package ch08.unit04;

public class Ex01 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.disp();//100,200,3.141592,50
	}
}

//final 변수 : 한번만 초기화 가능
class Test1 {
	//final 인스턴스 변수 : 객체가 생성되면서 한번만 초기화
	//                 : 초기화수식, 초기화 블럭, 생성자등에서 반드시 초기화 해야함
	final int a = 100;// 초기화수식으로 초기화
	final int b ;
	
	//static final 변수 : 클래스가 로딩되면서 한번만 초기화
	//                 : 초기화 수식, static 초기화 블럭에서 초기화를 해야함
	static final double PI= 3.141592;
	static final int C;
	
	static {
		C=50;
	}
	
	
	public Test1(){
		b=200;//생성자에서 final 인스턴스 변수 초기화
		//C=50; // 컴오류.static final 변수는 생성자에서 초기화 불가
	}
	
	public void disp() {
		//a=70; 컴오류
		System.out.println(a+","+b+","+PI+","+C);
	}
	
	public void sub() {
		final int x = 10;// 지역 변수가 final
		final int y;
		y=20;//한번만 초기화 가능 
		
		//x=100;//컴에러
		//y=200;//컴에러
		
		System.out.println(x+","+y);
	}
}