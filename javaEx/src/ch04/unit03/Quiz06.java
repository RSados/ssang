package ch04.unit03;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		
		System.out.print("두수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		d=a;
		if(a>=b) {
			c=a;
			a=b;
			b=c;
		}
		c=0;
		while(a<=b) {
			c+=a;
			a++;
		}
		System.out.printf("%d ~ %d 까지의 합 = %d",d,b,c);
		
		
		
		sc.close();
	}

}
