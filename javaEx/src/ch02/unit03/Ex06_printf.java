package ch02.unit03;

public class Ex06_printf {

	public static void main(String[] args) {

		
		int a = 10, b = 5;
		System.out.printf("%d %d %d %d %d\n", a,b,a,a,b);
		System.out.printf("%1$d %2$d %1$d %1$d %2$d\n", a,b);
		String s = '0' + 9 + "Hello";
	    System.out.println(s);

	}

}
