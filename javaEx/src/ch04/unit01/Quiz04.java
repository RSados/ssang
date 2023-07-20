package ch04.unit01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int a;
	double b=0;
	System.out.print("점수 ? ");
	a=sc.nextInt();
	
	if(100>=a&&a>=95) {
		b=4.5;
	}else if(a>=90) {
			b=4.0;
	}else if(a>=85) {
		b=3.5;
	}else if(a>=80) {
		b=3.0;
	}else if(a>=75) {
		b=2.5;
	}else if(a>=70) {
		b=2.0;
	}else if(a>=65) {
		b=1.5;
	}else if(a>=60) {
		b=1.0;
	}else if(a>=0) {
		b=0.0;
	}
	
	if(100>=a&&a>=0) {
		System.out.println("점수: "+a+", 평점 : "+b);
	}
	else {
		System.out.println("입력오류");
	}
	
	
	sc.close();
	}
}
