package ch03.unit01;

public class Ex08 {
	public static void main(String[] args) {
		int a;
		
		a=123456;
		
		//1의 자리 버림
		a= a/10*10;
		System.out.println(a);
		
		//1의 자리 반올림
		a=123456;
		a= (a+5)/10*10;
		System.out.println(a);
		
		//1의 자리 올림
		a=123456;
		a= (a+9)/10*10;
		System.out.println(a);
	}

}
