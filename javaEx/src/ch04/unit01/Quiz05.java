package ch04.unit01;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("근무시간 ? ");
		a=sc.nextInt();

		if(a>8) {
			b=(8*10000)+((a-8)*15000);
		}
		else {
			b=a*10000;
		}
		
	System.out.printf("급여 : %,d원",b);
		
	sc.close();	
	}
}
