package ch07.unit07;

import java.text.DecimalFormat;

public class Ex03_DecimalFormat {
	public static void main(String[] args) {
		//DecimalFormat : 패턴 형식으로 형변환
		String s;
		DecimalFormat df = new DecimalFormat("#,##0");
		s = df.format(12345.56789);//반올림
        System.out.println(s);//12,346
		
        DecimalFormat df2 = new DecimalFormat("#,##0.##");
		System.out.println(df2.format(1234.123));//1,234.12
		System.out.println(df2.format(1234));//1,234
		
        DecimalFormat df3 = new DecimalFormat("#,##0.0#");
		System.out.println(df3.format(1234.123));//1,234.12
		System.out.println(df3.format(1234));//1,234.0
		System.out.println();
		
        DecimalFormat df4 = new DecimalFormat("000.#");
		System.out.println(df4.format(1234.123));//1234.1
		System.out.println(df4.format(12));//012
		System.out.println(df4.format(0));//000
		System.out.println(df4.format(0.5));//000.5
		
		System.out.printf("%08d\n",25);//00000025
		
		
	}

}
