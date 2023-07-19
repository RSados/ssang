package ch03.unit05;

import java.util.Scanner;

/*
 연도를 입력 받아 윤년인지 평년인지 판별하여 출력하는 프로그램 
 연도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년이고 
 그렇지 않으면 평년이다
 년도? 2024
 2024:윤년
 */
public class Quiz02 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int y;
	String s;
	
	System.out.print("년도 ? ");
	y=sc.nextInt();
	s= ((y%4)==0 && (y%100)!=0) || (y%400)==0? "윤년":"평년";
	
	System.out.println(y+":" +s);
	
	
	sc.close();
	}
}
