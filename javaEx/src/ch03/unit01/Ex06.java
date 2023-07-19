package ch03.unit01;

import java.util.Scanner;

/*
 원의 반지름을 입력 받아 넓이와 둘레 계산
 반지름? 10
 넓이 : xxx.x
 둘레 : xxx.x
 
 넓이 :반지름 * 반지름 * 3.141592
 둘레 :반지름 *2 * 3.141592
 */

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius;
		double area, len;
		double PI = 3.141592;
				
		System.out.print("반지름 ? ");
		radius = sc.nextInt();
		
		area = radius* radius * PI;
		len = radius *2 *PI;
		
		System.out.printf("넓이 : %.1f\n둘레 : %.1f",area,len);
		
		sc.close();
	}

}
