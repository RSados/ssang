package ch03.unit01;

public class Ex09 {
	public static void main(String[] args) {
		//String 의 +는 문자열 결합
		//a문자열 + 기본자료형 => 문자열러 결합
	    
		String s;
		
		s='A'+10+"korea";
		//'A'+10=> 75
		//75+"korea"	
		System.out.println(s);//75korea

		s= "korea"+'A'+10;
		System.out.println(s);//koreaA10
		
		char c = '0' + 20;//0은 암스키 코드 48 + 20 = 68이고 char이니 문자로 출력
		System.out.println(c);//D
		
		
	}

}
