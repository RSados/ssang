package ch04.unit03.forEx;

import java.util.Scanner;

//10개의 정수를 입력 받아 최대값 구하기
public class Quiz05 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n,s=0,i=0;
			
			//do {System.out.print("10개의 정수를 입력 하세요...");
			//n=sc.nextInt();
			//s=n
			//}while();
			
			//1.처음 읽어 들인수를 초기값으로 설정
			//2.입력받을수 있는 가장 작은값을 설정 0x80000000; 제일 작은 -21억 어쩌구 큰건 0x7fffffff
			
			System.out.print("10개의 정수를 입력 하세요...");
			for(n=1;n<=10;n++) {
				//if(n==1) {
				//System.out.print("10개의 정수를 입력 하세요...");}
			    s=sc.nextInt();
			    if(s>i||n==1) {
			    	i=s;
			    	
			    }
			}
			System.out.println("최대값: "+i);
			sc.close();
		}
		}

}
