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
		
		a=10;
		b= a++ + ++a + ++a + a++ + a++; //10 12 13 13 14
		System.out.println(a+ ","+b);//15 62
		
		a=0;
		b= a---a; //a - --a or a-- - a
		System.out.println(a+ ","+b);	//-1,1
		}

}
