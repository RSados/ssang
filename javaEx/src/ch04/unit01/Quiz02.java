package ch04.unit01;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int a;
	String b;
	System.out.print("년도 ? ");
	a=sc.nextInt();
	
	if(a%4==0) {
		if(a%100==0) {
			b="평년";
	
	 if(a%400==0) {
			b="윤년";
		}}
		else {
			b="윤년";
		}
		
	}else {
			b="평년";
		}//한줄압축가능 다른데에 쓴거
	System.out.printf("%d년도는 %s입니다.",a,b);
	

	
	sc.close();
}
}
