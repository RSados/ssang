package ch03.unit05;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//두 정수를 입력 받아 두 정수 사이의 정수의 개수는?
		/*
		 두수 ? 1 5 
		 1 과(와) 5 사이의 정수의 개수는 5개
		 
		 두수 ? 5 1 
		 5 과(와) 1 사이의 정수의 개수는 5개
		 */
		Scanner sc = new Scanner(System.in);
		int a,b,n;
		
		System.out.print("두수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		n=a>b?  a-b+1:b-a+1 ;
		
		System.out.printf("%d과(와) %d 사이의 정수의 개수는 %d개",a,b,n);
		
		sc.close();
	}

}
