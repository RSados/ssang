package ch09.unit03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		try {
			System.out.print("두정수 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			
			System.out.println( a + "/" + b + "=" + c);
		} finally {
			System.out.println("예외 발생 유무와 상관없이 실행");
		    sc.close();
		}
		
		System.out.println("end...");
		
	}

}
