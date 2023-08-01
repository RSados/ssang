package ch07.unit04;

import java.util.Scanner;

/*
 정수를 입력 받아 몇자리 정수인지 출력
 실행예
 수? 130
 130:3자리 정수
 
 수?-130
 -130:3자리 정수
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		
		System.out.print("숫자 ? ");
		s1=sc.next();
		s2=s1.replace("-", "");
		//a=number>0?number:-number;
		//s=Integer.toString(a);
		System.out.println(s1+" 자릿수 ? "+s2.length());
		
		sc.close();
	}

}
