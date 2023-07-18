package ch02.unit04;

public class Ex02_Literal {

	public static void main(String[] args) {
		int a;
		long b;
		
		a=365;//10진수
		System.out.println(a);//365
		
		a=0365;//8진수
		System.out.println(a);//238
		
		a=0x356;//2진수
		System.out.println(a);//854

		a= 0b101;//2진수
	    System.out.println(a);//5
	    
	    a= 1_9_0;//_는 자리구분 용도
	    System.out.println(a);//190
	    
	    //a=358;//컴파일 오류 8진수에는 8이 없음
	    //a=0b102;//컴파일 오류 2진수에는 2가 없음
	    //a=AB;//컴파일 에러 AB는 변수이며 AB하는 변수가 정의되어 있지 않음
	    a=0xAB;//16진수
	    System.out.println(a);//171
	    
	    //b=2200000000000;//컴파일 오류
	    //2200000000000는 int리터널이며,int 리터널에는 220000000000가 없음
	    b = 220000000000L;//long 리터널
	    System.out.println(b);
	}

}
