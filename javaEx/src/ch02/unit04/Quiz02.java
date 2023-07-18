package ch02.unit04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int b;
		    int i = 0xFFFFFFF1;
		    int j = i;
		    System.out.println(j);

			System.out.print("한문자 ? ");
			b = sc.nextInt();//한문자 입력
			System.out.printf(" %c",b);//%c가 아스키 코드로 변환하여 알려줌
			System.out.print((char)b);//dsa
			
			sc.close();
	}

}
