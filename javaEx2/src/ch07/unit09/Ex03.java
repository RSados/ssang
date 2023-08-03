package ch07.unit09;

import java.time.LocalDateTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);//2023-08-03T14:25:33.271522200
		
		LocalDateTime t1 = now.plusDays(100);// 100일후
		System.out.println(t1);
		LocalDateTime t2 = now.minusDays(100);//100일 전
		System.out.println(t2);
		System.out.println();
		
		//년,월,일, 시,분 ,초,욘산
		LocalDateTime t3 = now.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println(t3);
		System.out.println();
		
		//변경 (년,월,일,시
		LocalDateTime t4 = now.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(10)
				.withHour(13);
		
		System.out.println(t4);
		
		
		
		
	}

}
