package ch07.unit03;

public class Ex01 {
	public static void main(String[] args) {
		int a =10,b;
		Integer obj = null;//int에 대응하는 Wrapper class
		
		//int는 null을 가질수 없지만 Intrger는 null을 가질수 이음
		//b= null;//컴파일 오류
		
		//기본 자료형을 Integer로 자동 형변환(Auto boxing)
		obj =a;
		//obj = Integer.valueOf(a);
		
		//Integer를 기본 자료형(int)로 형변환(Auto unboxing)
		b=obj;
		// b=ob.intValue();
		
		System.out.println(a+","+b+","+obj);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
