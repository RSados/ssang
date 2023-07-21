package ch04.unit03;

import java.util.Scanner;

public class QuizH02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,count,a;
		count=1;
		System.out.print("수 ? ");
		n=sc.nextInt();
		a=n;
		while(a>0) {
			a/=10;
			if(a>=1) {
				count++;
			}
			
				}	
		System.out.println(n+"은"+count+"  자리 정수");
	sc.close();
	}

}
