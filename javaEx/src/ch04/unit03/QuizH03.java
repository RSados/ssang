package ch04.unit03;

import java.util.Scanner;

public class QuizH03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min,max,a,b,c;
		max=min=0;
		c=1;
		System.out.print("두수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) { //a,b의 크기에 따른 위치 변경
			c=a;
			a=b;
			b=c;
		}
		min=a*b;
		while(c>0) {
			c=b%a;
			if(c!=0) {
				b=a;
				a=c;
			}
			else {
				max=a;
			}
		}
		min/=max;
		System.out.println(max+"은 최대 공약수\t"+min+"은 최소 공배수");
		sc.close();
	}
}
