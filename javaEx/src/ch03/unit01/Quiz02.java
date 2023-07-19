package ch03.unit01;

import java.util.Scanner;

/*
 금액을 입력 받아 5만원권에서 1원권까지의 화폐 매수 구하기
 금액 ? 35324234
 5만원권:xx
 .
 .
 .
 1원권: xx
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("금액 ? ");
		a = sc.nextInt();
		
        System.out.printf("5만원: %d\n만원권: %d\n5천원권: %d\n천원권: %d\n5백원권: %d\n백원권: %d\n십원권: %d\n5원권: %d\n일원권: %d",a/50000,(a/50000)%10000,(a/10000)%1000,(a/1000)%500,(a/500)%100,(a/100)%50,(a/50)%10,(a/10)%5,(a/5)%1);
		System.out.println("5만원:"+a/50000);
		System.out.println("5만원:"+a/50000);
		System.out.println("5만원:"+a/50000);
		System.out.println("5만원:"+a/50000);
		System.out.println("5만원:"+a/50000);
		System.out.println("5만원:"+a/50000);
		System.out.println("5만원:"+a/50000);
		sc.close();
		

	}

}
