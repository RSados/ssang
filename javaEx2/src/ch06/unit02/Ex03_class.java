package ch06.unit02;

public class Ex03_class {
	public static void main(String[] args) {
		Test3 t = new Test3();//객체 선언 및 메모리 할당
		//t.a=10;//컴파일 에러. private필드는 외부에서 접근 불가
		t.write();
	}

}


class Test3{
	//필드 접근 제어자
	//private < 디폴트 < protected < public
	
	private int a = 10; // 클래스 내에서만 접근가능
	int b=20;//동일한 패키지에 접근 가능
	protected int c = 30;//동일한 패키지 및 하위 클래스에서 접근 가능
	public int d = 40;//어디에서나 접근 가능
	
	//메소드
	public void write() {
		System.out.println(a+","+b+","+c+","+d);
	}
	
	
}