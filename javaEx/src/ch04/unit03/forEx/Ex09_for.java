package ch04.unit03.forEx;

public class Ex09_for {
	public static void main(String[] args) {
		int n=2000000000;
		int count = 0;
		
		//for 문에서 절대로 float형을 사용하지 않는다.
		for(float f =n; f<n+50;f++) {
			count++;
		}
		//아래의 결과는 50이 나오지 않는다.
		System.out.println(count);//0
		
		float a,b;
		a=2000000000;
		b=2000000050;
		System.out.println(a==b);//true
	}

}
