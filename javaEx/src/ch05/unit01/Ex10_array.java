package ch05.unit01;

import java.util.Scanner;

public class Ex10_array {
	public static void main(String[] args) {
		//금액에 따른 화페 매수
		Scanner sc = new Scanner(System.in);
		
		int [] unit=new int[] {50000,10000,5000,1000,500,100,50,10};
		int money;
		System.out.print("금액 ? ");
		money=sc.nextInt();
		
		money=money/10*10;//10원 미만 버림
		
		System.out.println("금액: "+money);
		for(int u: unit) {
			System.out.println(u+"원\t"+(money/u));
			money%=u;
		}
		
		
		sc.close();
	}

}
