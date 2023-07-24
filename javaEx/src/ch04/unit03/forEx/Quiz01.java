package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,sum=0;
		do {
		System.out.print("수 ? ");
		n=sc.nextInt();}while(n<1||n>=1000);
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.printf("1~%d까지의 합 : %d",n,sum);
		
		
		
		
		
		sc.close();
	}

}
