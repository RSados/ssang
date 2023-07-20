package ch04.unit02;

import java.util.Scanner;

public class Ex10_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("점수 ? ");
		n=sc.nextInt();
		
		var s = switch (n/10) {
		case 10, 9 -> 4.0;
		case 8 ->3.0;
		case 7 ->2.0;
		case 6 ->1.0;
		case 5,4,3,2,1,0 ->{yield 0.0;}
		//case 5,4,3,2,1,0 ->yield 0.0; //에러.yield는 반드시 {} 필요
		//case 5,4,3,2,1,0 ->0.0;//가능
		default -> "입력오류";
		};
		System.out.println(n+"->"+s);
		
		sc.close();
	}

}
