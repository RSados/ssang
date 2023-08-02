package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int input,even,odd;
			
			even=odd=0;
			System.out.println("10개의 정수입력 :");
			
			for(int i=0;i<10;i++) {
				input = sc.nextInt();
				if(input%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		
		System.out.println("짝수의 개수 : "+even);
		System.out.println("홀수의 개수 : "+odd);
		sc.close();}
	}

}
