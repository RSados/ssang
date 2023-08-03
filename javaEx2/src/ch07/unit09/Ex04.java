package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04 {
public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
			System.out.println(now+ "\n");
	LocalDateTime ldt;
	ldt = now.with(TemporalAdjusters.lastDayOfMonth());
	System.out.println("이번달 마지막일자: "+ldt);
	System.out.println(ldt.getDayOfMonth());
	System.out.println();
	
	ldt = now.with(TemporalAdjusters.firstDayOfNextMonth());
	System.out.println("이전달 마지막일자: "+ldt);
	System.out.println(ldt.getDayOfMonth());
	System.out.println();
	
	// 이번달의 첫 월요일
	
	ldt = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
	System.out.println("이번달의 첫월요일: "+ldt);
	System.out.println();
	
	
	
}
	
}
