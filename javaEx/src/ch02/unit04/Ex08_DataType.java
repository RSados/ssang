package ch02.unit04;

public class Ex08_DataType {

	public static void main(String[] args) {
		//char : 부호없는 정수형. 2byte
		
		char c1 = 'A';
		char c2;
		char c3;
		
		c2 = '\uB300'; // 유니코드(16진수), 아스키 코드 65에 해당하는 값
		c3= '\uAE30';
		
		System.out.println(c1 + "," + c2 + "" + c3);//AAA
		
		//c1 = '';//컴파일 에러.빈 문자열 없음
		//c1 = 'AB';//컴파일 에러.문자는 한글자로만 구성되어야 함
		//c1 = "A";//컴파일 에러."A"는 문자열로 char에 대입불가
		
		c1= '대';
		System.out.println(c1);
		
		int a =c1;//char<int
		System.out.println(a);//45824. '대'의 유니코드 값
		
		a= '대';
		System.out.println(a);//45824
		
		a= '0';//문자 '0'
		System.out.println(a);//문자'0'의 아스키 코드 값 :48
		
		double b;
		b = 'A' + 10;
		System.out.println(b);//75.0
	}

}
