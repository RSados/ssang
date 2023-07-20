package ch04.unit02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y,m,d=0;
		
		System.out.print("년도 ? ");
		y=sc.nextInt();
		System.out.print("월 ? ");
		m=sc.nextInt();
		
		

	switch(m) {
	case 1:d=31;break;
	case 2:d=28;break;
	case 3:d=31;break;
	case 4:d=30;break;
	case 5:d=31;break;
	case 6:d=30;break;
	case 7:d=31;break;
	case 8:d=31;break;
	case 9:d=30;break;
	case 10:d=31;break;
	case 11:d=30;break;
	case 12:d=31;break;
	}
	/*case 1:case 3:case 5:case 7:case 8:case 10:case 12:d=31;
	 case 4:case 6:case 9:case 11:d=30;
	 case 2: d=y%4==0&&y%100!=0 || y%400==0? 29:28; break;
	 default: d=-1; break;
	 */
	if(((y%4==0&&y%100!=0)||y%400==0)&&m==2) {
			d=29;
		
	}else if(m==2) {
		d=28;
	}
	if(d==-1) {
		System.out.println("날짜 입력 오류...");
	}else {
	System.out.println(y+"년 "+m+"월은 "+d+"일까지 있습니다.");
	sc.close();}
	}

}
