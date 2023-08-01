package ch07.unit04;

public class Ex02 {
	public static void main(String[] args) {
		//문자열 비교
		String s1 = "seoul";
		String s2 = new String("seoul");
		
		//객체에서 == 는 주소를 비교한다.
		System.out.println(s1=="seoul");//true.주소 비교
		System.out.println(s2=="seoul");//false.주소 비교
		System.out.println(s1==s2);//false.주소 비교
		
		//String 의 equals() : Object 클래스의 equals()를 재정의하여
		// 문자열을 비교하는 메소드
		System.out.println(s1.equals("seoul"));//true.문자열 비교
		System.out.println(s2.equals("seoul"));//true.문자열 비교
		System.out.println(s1.equals(s2));//true.문자열 비교
		
		
		
		
		
	}

}
