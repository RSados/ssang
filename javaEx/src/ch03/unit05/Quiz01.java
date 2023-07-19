package ch03.unit05;

import java.util.Scanner;

/*
 한문자를 입력 받아 소문자이면 대문자로 변환하여 출력하고 대문자이면 소문자로 변환하여 출력한다.
 입력 받은 문자가 영문자가 아니면 입력받은 문자 그대로 출력한다.
 참고 :대소문자의 암스키 코드 차이는 32
 
 문자 ? A
 A-> a
 
 문자 ? 7
 7-> 7
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c,s;
		int a;
		
		System.out.print("문자 ? ");
		c=sc.next().charAt(0);
		a=c;
		
		s= c>='A'&& c<='Z'? (char)(c+32):c>='a'&& c<='z'? (char)(c-32):(c);
		System.out.printf("%c->%c",c,s);
		
		sc.close();
		
	}

}
