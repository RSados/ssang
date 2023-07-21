package ch04.unit03;

public class Ex03_while {
	public static void main(String[] args) {
		//영문자 출력
		/*
	char c=64;
	while(c++<'Z') {
		System.out.print(c);
	}
	System.out.println();
	*//*
		char c='A';
		while(c<='Z') {
			System.out.print(c);
		c++;}
		System.out.println();*/
		/*
		char c='A';
		int n=0;
		while(c<='Z') {
			System.out.print(c);
			n++;
			if(n%7==0) {
				System.out.println();
			}
		c++;
		}
		System.out.println();*/
		
		char c='A';
		int n=0;
		while(c<='Z') {
			System.out.print(c+(++n%7==0?"\n":""));
           c++;
		}
		System.out.println();
		}

}
