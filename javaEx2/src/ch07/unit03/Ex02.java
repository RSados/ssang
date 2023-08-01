package ch07.unit03;

public class Ex02 {
	public static void main(String[] args) {
		String s1,s2;
		int a,b;
		
		s1="123";
		s2="456";
		System.out.println(s1 + "+" + s2);//123456 : 문자열 결합
		
		//문자열을 정수로 변환
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		System.out.println(a + b);
		
		//a= Integer.parseInt("1,235");//런타임오류(NumberFormatException) 컴마 있으면 못바꿈
		//a= Integer.parseInt("123.5");//런타임오류(NumberFormatException) 정수를 바꾸는 놈이라 소수점 있으면 못함
		//a= Integer.parseInt("b1");//런타임오류(NumberFormatException) 숫자가 아님
		
		//16진수 문자열을 정수(10진수)로 변환
		a= Integer.parseInt("b1",16);//뒤쪽에 16진수라고 표기해주면 바꿔줌
		System.out.println(a);//177
		
		a= Integer.parseInt("10110");
		System.out.println(a);//10110
		
		//2진수 문자열을 정수(10진수)로 변환
		a= Integer.parseInt("10110",2);//뒤쪽에 2진수라고 표기해줘서 바꿔줌
		System.out.println(a);//22
		
		//정수를 String으로 변환
		a= 123;
		s1= Integer.toString(a);
		System.out.println(s1);
		
		//정수를 2진수의 String으로 변환
		a= 123;
		s1= Integer.toBinaryString(a);
		System.out.println(s1);//1111011
		
		//정수를 16진수의 String으로 변환
		a= 123;
		s1= Integer.toHexString(a);
		System.out.println(s1);//7b
	}

}
