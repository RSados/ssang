package ch04.unit03;

public class Ex12_loop {
	public static void main(String[] args) {
		int n,s;
		
		/*
		s=n=0;
		while(true) {
			n++;
			s+=n;
		}
		System.out.println("결과:"+s);//컴파일 에러 발생 while(true)를 빠져 나올수가 없어서
		*/
		s=n=0;
		while(true) {
			n++;
			s+=n;
			if(n>=10)break;
		}
		System.out.println("결과:"+s);
	}

}
