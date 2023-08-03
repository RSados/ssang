package ch07.unit09;

//import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex02_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		int y = dateTime.getYear();
		int m = dateTime.getMonthValue();
		int d = dateTime.getDayOfMonth();
		//DayOfWeek w = dateTime.getDayOfWeek();
		String w = dateTime.getDayOfWeek().toString();
		int h = dateTime.getHour();
		int mi = dateTime.getMinute();
		int s = dateTime.getSecond();
		int n = dateTime.getNano();
		
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d.%d %s\n",y,m,d,h,mi,s,n,w);
		
		LocalDate nowDate = dateTime.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("윤년:2월 29일");
		}else {
			System.out.println("평년:2월 28일");
		}
		
	}

}
