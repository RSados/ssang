package ch07.unit07;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01_Formater {
	public static void main(String[] args) {
		String s;
		
		//숫자 => 문자열로 변경
		int n= 12345;
		s = Integer.toString(n);
		System.out.println(s);
		
		s= String.format("%,d", n);
		System.out.println(s);
		
		double d= 123.456789;
		s = Double.toString(d);
		System.out.println(s);//123.456789
		
		s = String.format("%.2f", d);
		System.out.println(s); // 123.46
		
		s=String.format(Locale.ITALY,"%.2f", d);
		System.out.println(s); // 123,46 이탈리아 사양
		System.out.println();
		
		//숫자에 대한 포멧
		NumberFormat nf = NumberFormat.getInstance();
		n=123456;
		s=nf.format(n);
		System.out.println(s);//123,456
		
		d=12345.25678;
		s=nf.format(d);
		System.out.println(s);//12,345.257
		
		//소수점 이하 자리수를 최소 및 최대 지정
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMinimumFractionDigits(2);
		nf2.setMaximumFractionDigits(4);
		System.out.println(nf2.format(123456.1234567));//123,456.1235
		System.out.println(nf2.format(123456.1));//123,456.10
		System.out.println(nf2.format(123456));//123,456.00
		System.out.println();
		
		//통화에 대한 서식
		n=345670;
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		s = nf3.format(n);
		System.out.println(s);//₩345,670
		System.out.println();

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		s = nf4.format(n);
		System.out.println(s);//$345,670.00
		System.out.println();

		//%서식
		d = 0.23;
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		s = nf5.format(d);
		System.out.println(s);//23%
		
		
		
		
		
		
	}

}
