package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex08_util {
	public static void main(String[] args) {
		String s1,s2;
		
		s1="2023-05-06";
		s2="2023-05-08";
		System.out.printf("%s ~ %s 일자 차이 : %d\n",s1,s2,todiffDays(s1,s2));
		
		s1="2023-05-05 10:10:10";
		s2="2023-05-06 11:10:10";

		System.out.printf("%s ~ %s 시간 차이 : %d\n",s1,s2,todiffHours(s1,s2));
		
		s1 = "2020-08-01";
		System.out.println("나이 : "+toAge(s1));

	}
	//두 날짜 사이 간격(일)
	public static long todiffDays(String start,String end) {
		long result =0;
		
		start = start.replaceAll("\\-|\\/|\\.", "");
		end = end.replaceAll("\\-|\\/|\\.", "");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		LocalDate beginDate = LocalDate.parse(start,dtf);
		LocalDate endDate = LocalDate.parse(end, dtf);
		
		result = beginDate.until(endDate, ChronoUnit.DAYS);
		
		
		
		
		return result ;
	}
	//두 날짜 사이 간격(일)
	public static long todiffHours(String start,String end) {
		long result =0;
		
		start = start.replaceAll("\\-|\\/|\\.", "");
		end = end.replaceAll("\\-|\\/|\\.", "");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss");
		
		LocalDateTime beginDate = LocalDateTime.parse(start,dtf);
		LocalDateTime endDate = LocalDateTime.parse(end, dtf);
		
		result = beginDate.until(endDate, ChronoUnit.HOURS);
		
		return result ;
	}
	
	public static int toAge(String birth) {
		int age=0;
		birth =birth.replaceAll("\\-|\\/|\\.", "");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		LocalDate now = LocalDate.now();
		LocalDate birthDate = LocalDate.parse(birth,dtf);
		
		age = (int)birthDate.until(now, ChronoUnit.YEARS);
		/*
		LocalDate date = now.withYear(birthDate.getYear());
		age = now.getYear()- birthDate.getYear();
		if(date.isBefore(birthDate)) { // date < birthDate
			age--;
		}*/
		
		return age;
	}

}
