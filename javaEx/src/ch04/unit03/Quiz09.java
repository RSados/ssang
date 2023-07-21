package ch04.unit03;

public class Quiz09 {
	public static void main(String[] args) {
		int n,a,b,c;
		n=0;
		a=0;
		b=1;
		c=0;
		while(c<8) {
			if(c%2!=0) {
				a=a+b;
				n+=a;}
			else {
				b=b+a;
				n+=b;
			}
			System.out.println(a+b);
			/*
			 a ,b ,c
			 c=a+b
			 a=b
			 b=c
			 */
			c++;}
			System.out.println(n);
		
	}
}
