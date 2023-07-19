package ch03.unit01;

public class Ex12 {
	public static void main(String[] args) {
		int a,b;
		
		a=10;
		b=a++ + a++ +1;
		System.out.println(a+","+b);//12,22
		
		a=10;
		b=++a + ++a +1;
		System.out.println(a+","+b);//12,24
	}

}
