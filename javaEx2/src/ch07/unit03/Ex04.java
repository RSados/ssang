package ch07.unit03;

public class Ex04 {
	public static void main(String[] args) {
		double d;
		
		//문자열을 double로 형 변환
		d=Double.parseDouble("123.5");
		System.out.println(d);
		
		d=Double.valueOf("123.5");
		System.out.println(d);
		
		//double를 문자열로 변환
		String s;
		s=Double.toString(123.5);
		System.out.println(s);
	}

}
