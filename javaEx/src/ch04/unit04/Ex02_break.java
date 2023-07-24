package ch04.unit04;

import java.util.Scanner;

public class Ex02_break {
	public static void main(String[] args) {
		//실수를 입력받아 입력 받은 수의 합 구하기
		//단,입력 받은 수가 0 이하이면 합을 출력 하고 종료
		Scanner sc = new Scanner(System.in);
		double input,sum;
		
		sum=0;
		while(true) {
		System.out.print("수[0=종료] ?");
		input = sc.nextDouble();
		if(input <=0.0) {
			break;
		}
		sum+=input;
		}
		System.out.println("결과:"+ sum);
		
		sc.close();
	}

}
