package ch07.unit03;

import java.math.BigInteger;

public class Ex05 {
	public static void main(String[] args) {
		//아주 큰정수를 다루는 클래스 : BigInteger
		
		BigInteger a= new BigInteger("123456789123456789123456789");
		BigInteger b= new BigInteger("12345678912345678912345678");
		
		BigInteger c;
		c=a.add(b);
		System.out.println(c);
		
		c=a.subtract(b);
		System.out.println(c);
		
		c=a.multiply(b);
		System.out.println(c);
	    
		c=a.divide(b);
		System.out.println(c);
	}
}
