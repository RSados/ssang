package ch03.unit01;

/*
 1) 연산을 위한 기본 타입은 int
 2) +,-,*,/,%연산은 피연산자가 byte,char,short이면 자동으로 int로 변환하여 연산
 */
public class Ex02 {

	public static void main(String[] args) {
		byte b1=5,b2=10,b3;
		
		b3 = 10+5;//리터널을 연산하면 형변환이 일어나지 않음
		System.out.println(b3);//15
		
		//b3= b1+b2;//컴파일 에러 
		//byte형 + byte형 => int형 + int형 : 결과가 int 형인데 다시 b3(byte)에 넣으려니 오류 발생
		
		b3= (byte)(b1+b2);
		System.out.println(b3);
		
		//b1 = 200; // 컴파일 에러 byte: -128~127
		b1=100;
		b2=120;
		b3=(byte)(b1+b2);
		System.out.println(b3);//-36, 오버플로우 발생
		
		short s1=10,s2=20,s3;
		//s3=s1+s2;//컴파일 에러
		s3=(short)(s1+s2);
		System.out.println(s3);
		
		char ch = 'A';
		
		//ch= ch+10;//컴파일 에러.char + int => int+int=>int
		ch= (char)(ch+10);
		System.out.println(ch);//k
		
		ch = 'A'+10;
		System.out.println(ch);//k
		
		int a;
		
		a= 0b101+20;//2진수
		System.out.println(a);//29
		
		a= 035 + 00;//8진수
		System.out.println(a);//29

	}

}
