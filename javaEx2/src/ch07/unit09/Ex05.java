package ch07.unit09;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex05 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime dataTime = LocalDateTime.of(2024, 9,10,17,20);
		
		System.out.println(now);
		System.out.println(dataTime);
		
		long y = now.until(dataTime,ChronoUnit.YEARS);//1
		long m = now.until(dataTime,ChronoUnit.MONTHS);//13
		long d = now.until(dataTime,ChronoUnit.DAYS);//404
		
		System.out.println(y+","+m+","+d);
	}

}
