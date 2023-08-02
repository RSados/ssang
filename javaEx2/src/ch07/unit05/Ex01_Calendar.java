package ch07.unit05;

import java.util.Calendar;
public class Ex01_Calendar {
	public static void main(String[] args) {
		//컴퓨터 시스템의 시간 날짜 및 시간을 이용하여 객체 생성
		Calendar cal = Calendar.getInstance();
		
		//%tF : 년-월-일, %tA : 요일 %tT : 시간 (시:분:초)
		//System.out.println"%tF %tA %tT",cal,cal,cal();
		//String s = String.format("%tF %tA %tT",cal,cal,cal);
		String s = String.format("1$%tF %1$tA %1$tT",cal);
	    System.out.println(s);
		
		int y = cal.get(Calendar.YEAR);//년도
		int m = cal.get(Calendar.MONTH)+1;//월(0~11)
		//int d = cal.get(Calendar.DATE);//일자
		int d = cal.get(Calendar.DAY_OF_MONTH);//일자
		int w = cal.get(Calendar.DAY_OF_WEEK);//요일 : 1(일)~7(토)
		int lastDay = cal.getActualMaximum(Calendar.DATE);//월의 마지막 일자
		
		System.out.println(y+"-"+m+"-"+d+", 요일:"+w+", 월의 마지막 일자:"+lastDay);
		
		//1999-08-31로 변경
		cal.set(1999,8-1,31);
		s=String.format("%tF %tA",cal, cal);
		System.out.println(s);
		
		//2023년 8월 33일 변경
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 8-1);
		cal.set(Calendar.DATE, 33);
		s=String.format("%tF %tA",cal, cal);
		System.out.println(s);
		
		//2023-07-01에 프로젝트를 시작했다. 개시 100일후는?
		cal.set(2023,7-1,1);
		cal.add(Calendar.DATE, 100);
		s=String.format("%tF %tA",cal, cal);
		System.out.println(s);
		
		// 1970-01-01 00:00:00 를 기준으로 밀리초 단위로 환산하여 변환
		Calendar now = Calendar.getInstance();
		long t = now.getTimeInMillis();
		
		System.out.println(t);
		
		
	}

}
