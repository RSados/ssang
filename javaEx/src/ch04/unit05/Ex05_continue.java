package ch04.unit05;

import java.util.Scanner;

public class Ex05_continue {
	public static void main(String[] args) {
		//0 이상의 5개의 홀수를 입력 받아 합구하기
		//입력 받은 수가 음수이거나 짝수이면 다시 입력 받는다
		Scanner sc = new Scanner(System.in);
		int n,s;
		
		s=0;
		System.out.println("5개의 홀수 입력...");
		for(int i=1;i<=5;i++) {
			n= sc.nextInt();
			if(n<0||n%2==0) {
				System.out.println("다시 입력...");
				i--;
				continue;
			}
			s+=n;
		}
		System.out.println("5개의 홀수의 핪은? "+s);
		sc.close();
	}

}
