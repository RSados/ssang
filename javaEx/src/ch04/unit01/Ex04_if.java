package ch04.unit01;

import java.util.Scanner;

public class Ex04_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n=sc.nextInt();
		/*	
		if(n%2==0) {
			//조건이 참이면
			System.out.println(n+":짝수");
			
		}else {
			//조건이 거짓이면
			System.out.println(n+":홀수");
			
		}*/
				
		String s;
		if(n%2==0) {
			s="짝수";
		}else {
			s="홀수";}
		System.out.println(n+"=>"+s);
			
		
		sc.close();
	}
}

