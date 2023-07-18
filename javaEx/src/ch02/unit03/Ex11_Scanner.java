package ch02.unit03;

import java.util.Scanner;

//데이터 입력
public class Ex11_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;//문자열 변수
		int age; // 정수형 변수
		char gender;//문자형 변수
		double height;//실수형 변수
		
		System.out.print("이름 ? ");
		name = sc.next();//문자열 입력. 공백이 구분 기호이므로 공백은 입력 불가
		
		System.out.print("나이 ? ");
		age = sc.nextInt();//정수 입력
		
		System.out.print("성별(M:남자, F:여자) ? ");
		gender = sc.next().charAt(0);//한문자 입력
		
		System.out.print("키 ? ");
		height = sc.nextDouble();//실수 입력
		
		System.out.println("이름 :  "+name);
		System.out.println("나이 :  "+age);
		System.out.println("성별 :  "+gender);
		System.out.println("키 :  "+height);
		
		sc.close();
	}

}
