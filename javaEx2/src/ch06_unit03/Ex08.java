package ch06_unit03;

public class Ex08 {
	int r;
	static double PI = 3.141592;
	
	public double area() {
		return r*r*PI;
	}
	
	public static void disp(double result) {
		System.out.println("넓이 :"+result);
	}
	
	public static void main(String[] args) {
		//r =10;//컴파일 에러.인스턴스 변수는 클래스 메소드에서 바로 접근불가
		
		Ex08 t = new Ex08();
		t.r=10;
		
		double a = t.area();
		disp(a);
	}

}

