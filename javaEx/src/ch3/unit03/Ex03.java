package ch3.unit03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("두수 ? ");
		a= sc.nextInt();
		b= sc.nextInt();
		
		System.out.println("원래수 : "+a+","+b);
		
		/*
		 //두변수의 값 바꾸기
		 int c =a;
		 a=b;
		 b=c;
		 */
		
		a=a^b;
		b=b^a;
		a=a^b;
		
		System.out.println("교환후 : "+a+","+b);
		
		sc.close();
	}

}
