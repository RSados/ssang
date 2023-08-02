package ch07.unit05;

import java.util.Date;

public class Ex07_Date {
	
	public static void main(String[] args) {
	Date date = new Date();
	System.out.println(date); // Wed Aug 02 17:11:32 KST 2023

	//사용을 권장하지 않음
	//int y = date.getYear()+1900;
	//System.out.println(y);
	
	//1970년 1월 1일 0시 0분 0초를 기준으로 밀리초로 환산하여 반환
	long t = date.getTime();
	System.out.println(t);
	
	Date date2 = new Date(1690964058505L);
	System.out.println(date2);
	
	//date 객체의 날짜가 date2의 객체 이후의 날짜인지 반환
	System.out.println(date.after(date2));//true
	
	
	
	
	}
}
