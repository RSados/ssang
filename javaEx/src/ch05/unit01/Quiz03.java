package ch05.unit01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num[] = new int[6];
		int count;
		
		do {
			System.out.print("구매개수[1~5] ? ");
			count=sc.nextInt();
		}while(count<1||count>5);
		
		for(int i=1; i<=count;i++) {//구매 개수 만큼
			//로또 1게임 만들기 (6개의 난수)
			for(int n=0;n<num.length;n++) {
				num[n]=(int)(Math.random()*45)+1;
				
				for(int j=0;j<n;j++) {
					if(num[n]==num[j]) {
						n--;
						break;
					}
				}
			}
			Arrays.sort(num);
			
			System.out.print(i+"번째: ");
			for(int n :num) {
				System.out.printf("%4d",n);
			}
			System.out.println();
			
		}
		sc.close();
	}

}
