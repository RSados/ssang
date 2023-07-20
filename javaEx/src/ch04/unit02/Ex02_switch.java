package ch04.unit02;

import java.util.Scanner;

public class Ex02_switch {
	public static void main(String[] args) {
		//break:switch문을 빠져 나감
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("수");
		n=sc.nextInt();
		
		switch(n) {
		case 3:System.out.print("***");break;
		case 2:System.out.print("##");break;
		case 1:System.out.print("@");break;
		}
		sc.close();
	}
}
