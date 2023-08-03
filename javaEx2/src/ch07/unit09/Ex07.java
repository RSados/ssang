package ch07.unit09;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex07 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2025, 10, 10);
		LocalDate date2 = LocalDate.now();
		
		System.out.println(date1);//2025-10-10
		System.out.println(date2);//2023-08-03
		System.out.println();
		
		//날짜 차이
		Period p = Period.between(date2, date1);//date1 - date2 의 결과
		System.out.println("차이:"+p);//P2Y2M7D
		System.out.println("년도차이 : "+p.get(ChronoUnit.YEARS));
		System.out.println("월차이 : "+p.get(ChronoUnit.MONTHS));
		System.out.println("일차이 : "+p.get(ChronoUnit.DAYS));
		System.out.println();
		
		//시간차이
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(0,0,0);
		
		System.out.println(time1);//15:21:51.867227300
		System.out.println(time2);//00:00
		System.out.println();
		
		Duration d = Duration.between(time2, time1);//time1 - time2
		System.out.println("시간차이 : "+d);//PT15H23M29.5708069S
		System.out.println("초:"+d.getSeconds());//55809

		
	}
}
