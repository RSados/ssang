package ch03.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,h;
		double m,s,time,ss;
		
		System.out.print("주행거리(km) ? ");
		a = sc.nextInt();
		System.out.print("시속(km/h) ? ");
		b = sc.nextInt();
		/*
		time =(double)a/b;
		h=(int)time;
		m=(int)(time*60%60);
		s=(time*3600)%60;
		s=(int)(s*100)/100.0;*/
		/*time=b;
		h=a/b;
		m=(int)(a%b/(time/60));
		s=(a%b%(time/60)/(time/60));	*/
		
		ss=(double)b/3600;
		time=a/ss;
		h=(int)time/3600;
		m=time%3600/60;	
		s=time%3600%60;
		s=(int)(s*100)/100.0;
		
		
		System.out.printf("%d km=>%d시간 %d분 %.2f초 소요",a,h,(int)m,s);
		
		
		
		
		sc.close();

	}

}
