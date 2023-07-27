package ch05.unit01.sortEx;

public class Ex02_bubble {
	public static void main(String[] args) {
		//Bubble Sort
		int num[]=new int[] {17,13,14,16,15};
		int t;
		
		System.out.print("Source Data: ");
		for(int n:num) {
			System.out.print(n+" ");}
			
	     //Sort
		 //1회전: (0:1)(1:2)(2:3)(3:4)
		 //2회전: (1:2)(2:3)(3:4)
		 //3회전: (2:3)(3:4)
		 //4회전: (3:4)
		for(int i=1;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					t=num[j];num[j]=num[j+1];num[j+1]=t;
				}
				
			}
		}
		
		
		
		
		
		System.out.println();
		
		System.out.print("Sort Data: ");
		for(int n:num) {
			System.out.print(n+" ");
			}
		System.out.println();
		
		
		
		
	}

}
