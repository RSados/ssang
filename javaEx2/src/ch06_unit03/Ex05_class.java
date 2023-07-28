package ch06_unit03;

import java.util.Arrays;

public class Ex05_class {
	public static void main(String[] args) {
		Test5 t = new Test5();
		
		int[]a= t.random();
		System.out.println(Arrays.toString(a));
		
		int b[]= t.random(5);
		System.out.println(Arrays.toString(b));
		
	}
}

class Test5{
//1~100 사이의 난수 10개 발생
	public int[] random() {

		
		int []num = new int [10];
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		return num;//리턴타입이 int[]이므로 반드시 배열의 주소를 반환해야함
	}
	public int[] random(int n) {
		if(n<1) {
			return null;
		}
		int []num =new int[n];
		
		for(int i=0; i<num.length;i++) {
			num[i]=(int)(Math.random()*100);		}
	
	return num;}
}