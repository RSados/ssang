package ch03.unit05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("정수 ? ");
		a= sc.nextInt();
		
		b=a>0? a : -a;
		System.out.println(a+"의 절대값: "+b);
		sc.close();
	}

}
