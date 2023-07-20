package ch04.unit02;

import java.util.Scanner;

public class Ex06_switch {
	public static void main(String[] args) {
		//입력받은 문자가 숫자인지 판별 
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.print("정수 ? ");
		c=sc.next().charAt(0);
		
		switch(c) {
		case '0':case '1':case '2':case '3':case '4':case '6':case'7':case '8':case '9':case '5':
			System.out.println("숫자");break;
			default:System.out.println("숫자아님");
		}
		sc.close();
		
		//if쓰는게 훨 간편함
		
		
	}

}
