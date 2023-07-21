package ch04.unit03;

public class Ex05_while {
	public static void main(String[] args) {
		//1~100까지 짝수합
	int a,b;
		a=b=0;
		while(a<100) {
			a+=2;
			b+=a;
		}
		System.out.println("결과: "+b);
		//1~100까지 홀수 합
		int n,s=0;
		n=1 ;
		while(n<100) {
			
			s+=n;
			n+=2;
		}
		System.out.println("결과: "+s);
		int d;
		d=b+s;
		System.out.println("1~100합은"+d);
	}

}
