package ch05.unit01;

import java.util.Scanner;

public class Ex11_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		//month[0] => 1월의 마지막 일자
		//month[11]=> 12월의 마지막 일자
		String[]weeks = new String[] {"일","월","화","수","목","금","토"};
		
		int y,m,d;
		int tot,w;
		
		do {
			System.out.print("년도 ? ");
		y=sc.nextInt();
		}while(y<1900);
		
		do {
			System.out.print("월 ? ");
		m=sc.nextInt();
		}while(m<1||m>12);
		//2월의 마지막 날짜 계산
		month[1] = y%4==0&&y%100!=0||y%400==0? 29:28;
		
		do {
			System.out.print("일 ? ");
		d=sc.nextInt();
		}while(d<1||d>month[m-1]);
		
	//1년 1월 1일은 월요일
    //1년 1월 1일 ~ y년 m월 d일 까지의 전체 일수
	//1.1.1~2023.07.26
	//tot=2022*365+1,2,3,4,5,6+26
    tot=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
    for (int i=0;i<m-1;i++) {
    	tot+=month[i];
    }
    tot+=d;
    w= tot%7;
    System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n",y,m,d,weeks[w]);
			sc.close();
			
			
			
			
			
			
			
			
	}		
}
