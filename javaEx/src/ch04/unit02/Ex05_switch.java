package ch04.unit02;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		//case에서의 문자열
		Scanner sc = new Scanner(System.in);
		String subject,code;
		
		System.out.print("과목코드(j1:자바,j2:서블릿,j3:스피링) ?");
		code = sc.next();
		
		switch(code) {
		case "j1":subject="자바";break;
		case "j2":subject="서블릿";break;
		case "j3":subject="스프링";break;
		default:subject="코드입력오류...";break;
		}
		System.out.println(code+"=>"+subject);
		sc.close();
		/*
		 if(code=="j1") //문자열은 ==으로 비교 불가
		 */
	}

}
