package ch04.unit01;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		
		System.out.print("정수 ? ");
		n=sc.nextInt();
		
		if(n%2==0) {
			s="짝수";
			System.out.println(s);}
	//s="";//가능 무자열은  길이가 0인 문자열이 가능
		//System.out.println(s);//컴오류. 초기화가 되어 있지 않지 때문에
		sc.close();
	}

}
