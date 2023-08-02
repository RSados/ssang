package ch07.unit05;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.DAY_OF_WEEK, 1);// 일요일
		System.out.printf("%tF %tA\n",cal,cal);
		
		cal.set(2023, 10-1,23);//각 필드는 변경되지만 실제 시간이 변경 안된다.
		System.out.printf("%tF %tA\n",cal,cal);//2023-10-23 월요일
		
		cal.set(Calendar.DAY_OF_WEEK, 1);
		System.out.printf("%tF %tA\n",cal,cal);
		System.out.println("----------------------------");
		/*
		 - 요일은 생성된 Calendar의 초기 날짜의 일요일로 변경(현재 시스템 날짜가 있는 주의 일요일)
		 - 시스템 날짜가 10월이 아닌 경우 해당월에서 시스템 날짜보다 크지 않는 일요일의 날짜 출력
		 - set() 메소드는 Calendar 필드의 값을 변경하지만 Calendar의 시간 값은 변경하지 않는다.
		 - Calendar의 시간 값은 get(), getTime(), getTimeInMillis(), add()등을 호출하면 변경된다.
		   따라서 set()에 대한 연산을 여러번 호출해도 불필요한 연산을 트리거하지 않는다.
		 */
         
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 10-1,23);
		
		cal2.getTime();//실제 시간이 변경
		
		cal2.set(Calendar.DAY_OF_WEEK, 1);
		System.out.printf("%tF %tA\n",cal2,cal2);

		
		
	}

}
