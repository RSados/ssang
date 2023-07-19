package ch03.unit01;

public class Ex04 {
	public static void main(String[] args) {
		int a= 3, b=2;
		double c;
		
		c=a/b + a/b;
		System.out.println(c);//2.0
		
		c=(double)a/b + a/b;
		System.out.println(c);//2.5
		
		c=(double)(a/b) + a/b;
		System.out.println(c);//2,0
		
		c=(double)a/b + (double)a/b;
		System.out.println(c);//3.0
		
		c=3.7%1.3;//% : 실수도 연산이 가능
		System.out.println(c);//1.1
		
		c='A'+15;
		System.out.println(c);//80.0
	}

}
