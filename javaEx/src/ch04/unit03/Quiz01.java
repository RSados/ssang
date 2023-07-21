package ch04.unit03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,c=0,s=0,d=0;
		
		System.out.print("수 ? ");
		n=sc.nextInt();
		
		while(c<n) {
			if(c%2==0) {
			c+=1;
			s+=c;}
			else {
				c+=1;
				d+=c;
			}
		}
		System.out.printf("1~%d까지 합은 = %d\n",n,d+s);
		System.out.printf("1~%d까지 짝수합은 = %d\n",n,s);
		System.out.printf("1~%d까지 홀수합은 = %d",n,d);
		sc.close();
	}

}
