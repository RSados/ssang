package ch02.unit04;

public class Ex05_DataType {

	public static void main(String[] args) {
		short a = 350, b = -350;
		
		System.out.println(a+","+b);
		System.out.printf("%X %X\n",a,b);//16진수로 출력
		System.out.printf("%#X %#X\n",a,b);//16진수로 출력
	
		byte b1 = (byte)129;
		byte b2 = (byte)385;
		System.out.println(b1==b2);//true
		//==두변수의 값이 같으면 참 다르면 거짓 다른 값이나 오버플로우로 인해 -127로 같은값으로 나옴
		System.out.println(b1+","+b2);
	    // -127, -127
	}
	

}
