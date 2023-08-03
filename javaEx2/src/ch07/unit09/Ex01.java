package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex01 {
	public static void main(String[] args) {
		String s;
		//날짜
		LocalDate date = LocalDate.now();
		System.out.println("현재 날짜 : " + date);
		
		s=date.toString();
		System.out.println("현재 날짜 : " + s);
		
		//날짜 지정
		LocalDate date2 = LocalDate.of(2023, 12, 25);
		System.out.println(date2);// 2023-12-25
		
		//현재 날짜/시간
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("\n현재날짜 및 시간 : "+dateTime);
		//2023-08-03T14:08:47.533150900
		String[] ss = dateTime.toString().split("T");
		System.out.println(ss[0]);
        System.out.println(ss[1]); 
        
        //날짜/시간 설정
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 10,25,10,5,0,0);
        System.out.println(dateTime2);//2023-10-25T10:05
        
        
	}

}
