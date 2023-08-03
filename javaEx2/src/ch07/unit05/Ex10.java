package ch07.unit05;

import java.util.Calendar;
import java.util.Date;

public class Ex10 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF\n",cal);
		
		//Calendar -> java.util.Date 로 변환
		Date date = cal.getTime();
		System.out.println(date);
		
		//java.util.Date -> Calendar 로 변환
		cal.setTime(date);
		System.out.printf("%tF\n",cal);
		
		
		//java.sql.Date : DB에 날짜를 저장하거나 DB에 저장된 날짜를 추출할때 사용
		//              : yyyy-MM-dd 형식으로 출력
		//              : JDK 9 부터는 java.sql.Date를 사용하기 위해 다음의 모듈을 추가해야 한다.
		//              : requires java.se;
		//java.util.Date -> java.sql.Date 로 변환
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		System.out.println(date2);//2023-08-03
		
	}

}
