package ch3.unit03;

public class Ex02 {
	public static void main(String[] args) {
		int a=13,b=20;
		int c,d;
		
		//홀수와 짝수를 판별하는 응용
		c= a&1;//    0000 1101
		d= b&1;// &  0000 0001
		       //    ---------
		       //    0000 0001
		      
		       //    0001 0100
		       // &	 0000 0001
		       //    ---------
		       //    0000 0000
		
		System.out.println(c+","+d);
		
		
		
	}

}
