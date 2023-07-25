package ch04.unit03.forEx;

public class Ex06_for {
	public static void main(String[] args) {
		//1~100까지 짝수합
		/*
		int n,s;
		s=0;
		for(n=2;n<=100;n+=2) {
			s+=n;
		}
		System.out.println(s);
		*/
		//1~100까지 홀수합
		/*
		int n,s;
		s=0;
		for(n=1;n<=100;n+=2) {
			s+=n;
		}
		System.out.println("결과:"+s);*/
		
		int s,n;
		
		s=0;
		n=1;
		while(n<10) {
			n+=2;
			s+=n;
			
		}
		System.out.println("결과: "+s);
	}

}
