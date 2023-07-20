package ch04.unit01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,x;
		char c;
		System.out.print("두수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("연산자[+,-,*,/} ? ");
		c=sc.next().charAt(0);
		
		
		
	if(c=='+') {
		x=a+b;
		System.out.println(a+" "+c+" "+b+"="+x);
	}else if(c=='-') {
		x=a-b;
		System.out.println(a+" "+c+" "+b+"="+x);
	}else if(c=='*') {
		x=a*b;
		System.out.println(a+" "+c+" "+b+"="+x);
	}else if(c=='/') {
		x=a/b;
		System.out.println(a+" "+c+" "+b+"="+x);
	}
	else {
		System.out.println("입력오류");
	}
	
	
	
	
		
		sc.close();
	}
}
