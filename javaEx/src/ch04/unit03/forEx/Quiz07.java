package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a,b,c,sum=0,avg=0,i=0;
			
			System.out.print("두정수 ?");
			a=sc.nextInt();
			b=sc.nextInt();
			
			if(a>b) {
				c=a;
				a=b;
				b=c;
			}
			
			for(;a<=b;a++) {
				if(a%3==0||a%5==0) {
					sum+=a;
					i++;
				}
			}
			avg=sum/i;
			System.out.println(sum+","+avg);
			
			sc.close();
		}
	}

}
