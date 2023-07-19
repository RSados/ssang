package ch03.unit05;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//정수를 입력 받아 짝수인지 홀수인지 판별
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s=a%2==0? "짝수":"홀수";
		s=(a&1)==0 ? "짝수":"홀수";//괄호 없으면 에러뜸
		
		System.out.println(a+"->"+s);
		
		sc.close();
	}

}
