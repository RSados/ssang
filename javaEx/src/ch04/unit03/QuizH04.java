package ch04.unit03;

import java.util.Scanner;

public class QuizH04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b,c,d;
		System.out.print("개수 ? ");
		n=sc.nextInt();
		a=b=d=0;
		c=1;
		while(a<n) {
			System.out.print(b+" ");
			d=b+c;
		    b=c;
		    c=d;
			
			a++;
			
		}
		
	
		sc.close();
	}

}
