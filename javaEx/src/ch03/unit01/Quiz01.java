package ch03.unit01;

import java.util.Scanner;

/*
 초를 입력 받아 시, 분, 초로 변호나하는 프로그램 작성
 초를 입력 하세요 ? 3680
 3680 초는 x시 x분 x초 입니다.
 */

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,h,m,s;
		
		System.out.print("초를 입력 하세요 ? ");
		a = sc.nextInt();
		
		m=(a/60)%60;
		h=a/3600;
		s=a%60;
		
		System.out.printf("%d 초는 %d시간 %d분 %d초입니다.",a,h,m,s);
		
		sc.close();
	}

}
