package ch04.unit01;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f;
	String x;
	char y;
	double g;
	
	System.out.print("학번 ? ");
	a=sc.nextInt();
	System.out.print("이름 ? ");
    x=sc.next();
    System.out.print("중간고사 점수 ? ");
	b=sc.nextInt();
	System.out.print("기말고사 점수 ? ");
	c=sc.nextInt();
	System.out.print("결석횟수 ? ");
	d=sc.nextInt();
	System.out.print("레포트 점수 ? ");
	e=sc.nextInt();
	
	if(d>=6) {
		f=0;
	}else if(d>=4) {
		f=60;
	}
	else if(d>=2) {
	    f=80;
	}
	else {
		f=100;
	}
	
	g=(b*0.4)+(c*0.4)+(f*0.1)+(e*0.1);
	
	if(g>=90) {
		y='A';
	}else if(g>=80) {
		y='B';
	}else if(g>=70) {
		y='C';
	}else if(g>=60) {
		y='D';
	}else {
		y='F';
	}
	
	System.out.println("학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
	 System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%c",a,x,(int)(b*0.4),(int)(c*0.4),(int)(f*0.1),(int)(e*0.1),(int)g,y);
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
