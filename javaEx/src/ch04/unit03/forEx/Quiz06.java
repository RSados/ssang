package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0,i;
		//1.처음 입력받은 값을 초기값으로 설정하는 방법
		//2.초기값을 입력받을수 있는 가장 크거나 작은 값으로 설정하는 방법
		for(n=1,i=s;n<=10;n++) {
			if(n==1) {
			System.out.print("10개의 정수를 입력 하세요...");}
		    s=sc.nextInt();
		    if(s<i||n==1) {
		    	i=s;
		    }
		}
		System.out.println("최대값: "+i);
		
		sc.close();
	}

}
