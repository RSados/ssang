package ch05.unit01;

import java.util.Arrays;

public class Ex12_sort {
	public static void main(String[] args) {
		int num[]=new int[10];
		
		for(int i=0; i<num.length;i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		
		//발생한 난수
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		//오른차순 정렬
		Arrays.sort(num);
		
		//정렬후
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
	}


}
