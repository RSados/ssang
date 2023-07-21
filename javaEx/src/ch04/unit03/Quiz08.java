package ch04.unit03;

public class Quiz08 {
	public static void main(String[] args) {
		int n,a,b;
		n=0;
		a=1;
		b=0;
		while(n<20) {
			
			a+=n;
			b=b+a;
			n++;
		}
		System.out.println(b);
	}

}
/*
a b n
1 1 1
2 3 2
2 1 2

*/