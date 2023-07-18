package ch02.unit04;

import java.util.Scanner;

public class Quiz01 {
/*
 한문자를 입력 받아 입력 받은 문자의 아스키 코드를 출력하는 프로그램 작성
 ex)한문자 ? B
    B -> 66
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a;
		
		System.out.print("한문자 ? ");
		a = sc.next().charAt(0);//한문자 입력
		System.out.printf("%c=>%d\n ",a,(int)a);//%c가 아스키 코드로 변환하여 알려줌
		
		sc.close();
	}

}
