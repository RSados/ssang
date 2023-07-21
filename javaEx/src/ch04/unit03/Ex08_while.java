package ch04.unit03;

public class Ex08_while {
	public static void main(String[] args) {
		int n,s;
		/*
		 n=s=0;
		 while(n<10){
		 n++;
		 s+=n;
		 System.out.println("결과:"+s);
		 
		 */
		n=s=0;
		do {
			n++;
			s+=n;
		}
		while(n<10);
		System.out.println("결과:"+s);
	}

}
