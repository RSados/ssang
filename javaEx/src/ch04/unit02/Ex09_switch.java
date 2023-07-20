package ch04.unit02;

import java.util.Scanner;

public class Ex09_switch {
	public static void main(String[] args) {
		
		
		//switch값 반환하기
		//서로 다른 자료형도 반환 가능 
		Scanner sc =new Scanner(System.in);
		int y,m;
		
		System.out.print("년도 ?");
		y=sc.nextInt();
		
		System.out.print("월 ? ");
		m=sc.nextInt();
		
		var d = switch(m) {
		case 1,3,5,7,8,10,12->31;//->가 break까지 내포
		case 4,6,9,11->30;
		case 2-> y % 4==0 && y % 100!=0 || y % 400==0? 29:28;
		default -> "입력오류";
		};
		

		System.out.println(y+"년 "+m+"월은 "+d+"일까지 있습니다.");
		
		
		
		sc.close();
	}}


