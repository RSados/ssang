package ch03.unit04;

public class Ex01 {
	public static void main(String[] args) {
		short a,b;
		
		a=10; b=5;
		//a=a+b;//컴파일 오류
		a=(short)(a+b);
		System.out.println(a);
		
		a=10;b=5;
		a+=b;
		System.out.println(a);
		
		char c = 'A';
		c+=10;
		System.out.println(c);
		
		float f = 3.5f;
		c='A';
		c+=f;
		System.out.println(c);//D
		
		int n =4;
		n *=0.5;
		System.out.println(n);//2
		
	}

}
