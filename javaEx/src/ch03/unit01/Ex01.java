package ch03.unit01;

public class Ex01 {

	public static void main(String[] args) {
		// 산술연산
		int a=13,b=5;
		int c,d,e,f,g;
		
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		
		System.out.println("a:"+a+","+"b:"+b);
		System.out.println("합:"+c);
		System.out.println("차:"+d);
		System.out.println("곱:"+e);
		System.out.println("몫:"+f);
		System.out.println("나머지:"+g);
		
		System.out.printf("%d+%d=%d\n",a,b,c);
						

	}

}
