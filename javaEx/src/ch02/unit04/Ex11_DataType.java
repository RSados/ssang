package ch02.unit04;

public class Ex11_DataType {

	public static void main(String[] args) {
		String s1, s2;//객체
		
		s1 = "korea";
		System.out.println(s1);
		
		//s2 = "";//가능. 길이가 0인 문자열
		
		//문자열 + 문자열 => 문자열을 결합
		s2= "seoul" + "korea";
		System.out.println(s2);//seoulkorea
		
		//문자열 + 다른 기본 자료형 => 문자열로 결합
		s2 = "korea" + 1 + 2;
		System.out.println(s2);//korea12
		
		s2 = "korea" + '1' + '2';
		System.out.println(s2);//korea12
		
		s2 = 1 + 2 +"korea";
		System.out.println(s2);//3korea
		
		//'1':49,'2':50
		s2 = '1' + '2' +"korea";
		System.out.println(s2);//99korea
		
		//s1=123;//컴파일 에러.정수를 String 변수에 대입 할 수 없다
		s1 = "" + 123;//가능은 하나 쓰지 않는 방법
		System.out.println(s1);

	}

}
