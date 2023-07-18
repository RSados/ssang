package ch02.unit02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 - 식별자
		 :유니코드 자바 레터,유니코드 숫자로 구성
		 :유니코드 자바 레터로 시작
		 :유니코드 자바 레터 - 영문자, _, $, 각국언어
		 */
		
		String name = "홍길동";//name : 식별자
		//String #name = "이자바";//컴파일 오류, #은 식별자로 사용 불가	
		String _tel = "010-1111-2222";
		String 주소 = "서울";// 각국언어는 식별자로 사용 가능
		
		int $age = 20;
		//int ~age = 20;//컴파일 오류
		//int age-1 = 20;//컴파일 오류
		int a = 10;
		//int a = 20;//컴파일 오류(동일한 이름으로 다시 선언 불가)
		
		//String int; //컴파일 오류. 예약어는 식별자로 사용 불가
		
		
		System.out.println("이름 : "+ name);
		System.out.println("전화 : "+_tel);
		System.out.println("주소 : "+주소);
		System.out.println("나이 : "+$age);
		System.out.println("a : "+a);
		}

}
