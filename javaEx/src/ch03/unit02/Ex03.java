package ch03.unit02;

public class Ex03 {
	public static void main(String[] args) {
		int a;
		boolean b1, b2;
		
		a=10;
		b1= false;
		b2= a>20 &&(b1 = true);//단축연산. &&는 앞이 거짓이면 뒤쪽 코드를 실행조차 하지 않음 어떤 내용이든 없는것과 동일
		System.out.println(b1 +","+ b2);//false, false
		
		a=10;
		b1= false;
		b2= a<20 &&(b1 = true);
		System.out.println(b1 +","+ b2);//true,true
		
		a=10;
		b1= false;
		b2= a>20 ||(b1 = true);
		System.out.println(b1 +","+ b2);//true,true
		
		a=10;
		b1= false;
		b2= a<20 ||(b1 = true);//단축연산. ||는 앞이 진실이면 뒤쪽 코드를 실행조차 하지 않음 어떤 내용이든 없는것과 동일
		System.out.println(b1 +","+ b2);//false,true
		
		
	}

}
