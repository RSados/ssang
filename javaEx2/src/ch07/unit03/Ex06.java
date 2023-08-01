package ch07.unit03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex06 {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("123456789.123456789");
		BigDecimal b = new BigDecimal("34567.89");
		
		BigDecimal c;
		
		//c= a.divide(b);//런타임 에러
		c=a.divide(b,RoundingMode.DOWN);//반올림하지 않음
		System.out.println(c);//3571.429703214
		
		c = a.divide(b,3,RoundingMode.DOWN);//소구점 이하 3자리
		System.out.println(c);//3571.429
		
		System.out.println(a.toBigInteger());//BigInteger로 변환//123456789
	}   

}
