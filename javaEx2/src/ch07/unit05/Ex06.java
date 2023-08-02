package ch07.unit05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateUtil util = new DateUtil();
		
		String birth;
		int age;
		
		do {
			System.out.print("생년월일 ? ");
			birth = sc.next();
		}while(!util.isVaildDate(birth));
		
		age=util.toAge(birth);
		
		System.out.println("생년월일 : "+birth);
		System.out.println("나이 : "+age);
		
		sc.close();
		
	}

}
