package ch04.unit01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	String x;
	
	System.out.print("이름 ? ");
    x=sc.next();
	System.out.print("세과목 점수 ? ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=(a+b+c)/3;
	if(a>=40&&b>=40&&c>=40&&d>=60) {
		System.out.println(x+"님은 합격 입니다.");
	}
	else if(d>=60) {
		System.out.println(x+"님은 과락 입니다.");
	}
	else {
		System.out.println(x+"님은 불합격 입니다.");
	}
	
	
	sc.close();
	}
}
