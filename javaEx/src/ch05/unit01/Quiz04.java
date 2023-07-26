package ch05.unit01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]months = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m;
		int tot,w;
		
		do {
			System.out.print("년도 ? ");
			y=sc.nextInt();
		}while(y<1);
	
	do {
		System.out.print("월 ? ");
		m=sc.nextInt();
	}while(m<1||m>12); 
	months[1]=y%4==0&&y%100!=0||y%400==0?29:28;
	
	tot = (y-1)*365 + (y-1)/4 - (y-1)/100+(y-1)/400;
	for(int i=0; i<m-1;i++) {
		tot += months[i];
	}
	tot+=1;//1일이 무슨 요일인지 알기위해
	
	w=tot%7;//7로 나눈 나머지 6나오면 토요일 0나오면 일요일 이런식
	
	System.out.printf("\n\t %d년 %d월\n",y,m);
	System.out.println("  일  월  화  수  목  금  토");
	System.out.println("-----------------------------------");
	//1일 앞의 공백 
	for(int i=0;i<w;i++) {
		System.out.print("    ");
	}
	//1월 부터 말일까지 출력
	for(int i=1;i<=months[m-1];i++) {
		System.out.printf("%4d",i);
	
	if(++w%7==0) {
		System.out.println();//토요일까지 출력후 라인 넘기기
	}}
	if(w%7!=0) {
		System.out.println();
	}
	System.out.println("-----------------------------------");
	sc.close();
	
	}
}
