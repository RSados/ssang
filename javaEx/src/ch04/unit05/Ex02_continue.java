package ch04.unit05;

import java.util.Scanner;

public class Ex02_continue {
	public static void main(String[] args) {
		//5개의 실수를 입력 받아 입력 받은 수의 합 구하기
		//단, 입력 받은 수가 0이하이면 다시 입력 받는다.
		Scanner sc= new Scanner(System.in);
		double n,s;
		
		s=0;
		System.out.print("5개의 실수 입력...");
		for(int i=0;i<5;i++) {
			n=sc.nextDouble();
			if(n<=0.0) {
				i--;
				System.out.print("다시 입력...");
				continue;
			}
			s+=n;
		}
		System.out.println("결과: "+s);
	}

}
