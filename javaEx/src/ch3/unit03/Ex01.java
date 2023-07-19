package ch3.unit03;

public class Ex01 {
	public static void main(String[] args) {
		int a,b;
		
		a=10;//0000 1010
		b=~a;//1111 0101
		System.out.println(b);//-11
		
		a = -10;//1111 0110
		b=~a;   //0000 1001
		System.out.println(b);//9
		
		a=13;//0000 1101
		b=7; //0000 0111
		System.out.println(a&b);//0000 0101=>5
		System.out.println(a|b);//0000 1111=>15
		System.out.println(a^b);//0000 1010=>10
	}

}
