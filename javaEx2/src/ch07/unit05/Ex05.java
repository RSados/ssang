package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//생년월일 입력 받아서 나이 구하기
		Scanner sc = new Scanner(System.in);
		String birth;
		
		do {
			System.out.println("생년월일 ? ");
			birth = sc.next();
			birth = birth.replaceAll("(\\-|\\/|\\.)", "");
		}while(! birth.matches("^(\\d{8})$"));
		
		int y = Integer.parseInt(birth.substring(0,4));
		int m = Integer.parseInt(birth.substring(4,6));
		int d = Integer.parseInt(birth.substring(6));
		
		Calendar cal = Calendar.getInstance();
		
		int y1 = cal.get(Calendar.YEAR);
		int m1 = cal.get(Calendar.MONTH)+1;
		int d1 = cal.get(Calendar.DATE);
		
		//나이 계산
		y1-=y;
		if(!(m1>=m&d1>d)) {
			y1--;
		}
		System.out.println(y1+"살");
		sc.close();
	
	}

}
