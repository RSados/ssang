package ch07.unit04;

import java.util.Scanner;

public class Ex04 {
	/*
	  이름을 입력 받아 김씨의 인원수 구하기
	  단, 입력값이 end, End, END 등이면 김씨 인원수를 출력하고 종료
	  실행 예
	  이름 ? 김자바
	  이름 ? 나자바
	  이름 ? 다자바
	  이름 ? 김파이
	  이름 ? end
	  김씨 2명
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int c=0;
		char c2;
		

		do {		System.out.print("이름 ? ");
		s1=sc.next();
		c2 = s1.charAt(0);
		if(c2=='김') {//if(s1.startsWith(김"))//s1.charAt(0)=='김'
			c++;
		}
		/*
		 if(name.subString(0,1).equals("김")
		 */
		if(s1.equalsIgnoreCase("end")) {
			break;
		}
			
		}while(true);
		System.out.println("김씨 : "+c+"명");
		sc.close();
	}

}
