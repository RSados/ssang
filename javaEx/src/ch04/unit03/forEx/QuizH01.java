package ch04.unit03.forEx;

import java.util.Scanner;

public class QuizH01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b=0,c=0x7fffffff,d=0;
		
		System.out.print("5개의 숫자를 입력하세요... ");
		for(int i=1;i<=5;i++) {
			a=sc.nextInt();
			if(a>=7) {
				b=a-7;
			}
			else if(a<7) {
				b=7-a;
			}
			if(c>b) {
				c=b;
				d=a;
			}
		}
		System.out.println(d);
		sc.close();
	}

}
/*
 diff= input>7? input -7:7-input;
 
 if(i==0||min>diff){
 min=diff;
 result=input;
 }
 }
 
 
 */
 
 
 
