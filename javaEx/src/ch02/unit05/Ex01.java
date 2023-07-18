package ch02.unit05;

public class Ex01 {

	public static void main(String[] args) {
		//int a = 0;
		// double b = 10.5;
		//지역변수 유형 추론 JDK 10 이상부터 사용가능
		//var x; 컴파일 에러 초기화 필요
		var a =10;
		var b=10.5;
		var c="seoul";
		int x = a;
		double y=b;
		String z=c;
		
		System.out.println(x+y+z);
		
		
	}

}
