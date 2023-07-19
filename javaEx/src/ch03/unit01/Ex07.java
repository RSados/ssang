package ch03.unit01;

public class Ex07 {
	public static void main(String[] args) {
		double a =123.4566;
		int n;
		
		System.out.println(a);//123.4566
		System.out.printf("%f\n",a);//123.456600
		System.out.printf("%,2f\n",a);//123.46
		
		//소수점 셋째자리 버리기
		n=(int)(a*100);
		System.out.println(n);//12345
		
		a=n/100;
		System.out.println(a);//123.45
	}

}
