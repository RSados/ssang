package ch05.unit01.sortEx;

import java.util.Arrays;

public class Ex03_bubble {
	public static void main(String[] args) {
		//개선된 bubble sort
		int num[]= {23,10,13,17,25,30,33,37,35,39};
		boolean flag;
		System.out.print("Source Data: ");
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+" ");
			
		}
		System.out.println(); 
			
		int t;
		flag = true;
		for(int i=1; flag;i++) {
			flag=false;
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
					flag=true;
				}
			}
			System.out.println(i+"회전: "+Arrays.toString(num));
			
		}
		System.out.print("sort Data : ");
		for(int n: num) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	

}
