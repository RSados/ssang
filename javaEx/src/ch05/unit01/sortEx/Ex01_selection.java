package ch05.unit01.sortEx;

import java.util.Arrays;

public class Ex01_selection {
	public static void main(String[] args) {
		//selection sort
		int[]num = new int[] {15,2,13,8,12};
		
		System.out.print("Source Data:");
		for(int n : num) {
			System.out.print(n+" ");
			
		}
		System.out.println();
		
		//Sort
		int t;
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					t=num[i];num[i]=num[j];num[j]=t;
				}
			}
			//System.out.println((i+1)+"회전: "+Arrays.toString(num));
		}
		System.out.print("Sort Data: ");
		for(int n : num) {
			System.out.print(n+ " ");}
			System.out.println();
		
	}

}
