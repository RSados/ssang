package ch07.unit04;

import java.util.Scanner;

/*
 입력 받은 문자열중 대소문자를 구분하지 않고 kor로 시작하는 문자열의 개수를 구학
 단 입력받은 문자열 end이면 종료
 */
public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		int count =0;
		
		while(true) {
			System.out.print("문자열 ? ");
			s=sc.next();
			
			if(s.equalsIgnoreCase("end")) {
				break;
			}
			
			/*런타임 오류가 발생할 수 있음 
			if(s.length()>=3) {
			if(s.substring(0,3).equalsIgnoreCase("kor")) {//3자리 미만이면 에러
				count+=1;
			}}*/
			if(s.toLowerCase().indexOf("kor")==0) {
				count++;
			}
		}
		System.out.println("kor로 시작하는 문자열의 개수 : "+count);
		sc.close();
	}

}
