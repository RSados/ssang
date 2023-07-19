package ch03.unit01;

public class Ex10 {
	public static void main(String[] args) {
		int a,b;
		
		System.out.println("초기 a : 10");
		
		a= 10;
		b=++a;//a=a+1;b=a; 동일한 결과
		//1)++a를 먼저 실행 (a는 11이 됨)
		//2))b=a를 실행 (b는 11이 됨)
		System.out.println(a+","+b);//11,11
		
		a=10;
		b=a++;
		//1))b=a를 먼저 실행 (b는 10이 됨)
		//2)a++를 실행 (a는 11이 됨)
		System.out.println(a+","+b);
		
		a=10;
		b=--a;
		System.out.println(a+","+b);//9,9
		
		a=10;
		b=a--;
		System.out.println(a+","+b);//9,10
		
		a=10;
		++a;
		System.out.println(a+","+b);
		
		a=10;
		a++;
		System.out.println(a+","+b);
	}

}
