package ch07.unit04;

public class Ex07 {
	public static void main(String[] args) {
		String s1,s2;
		
		//대한 -> 大韓
		s1="우리나라 대한민국 대한사랑";
		s2=s1.replaceAll("대한", "大韓");//정규식 사용 가능
		System.out.println(s2);
		
		s2= s1.replace("대한","大韓");//정규식 사용 불가
		System.out.println(s2);
		
		s1 = "우리 123 나라 45 대한";
		//숫자와 공백 제거. \\s : 공백(엔터, 탭도 포함)
		s2=s1.replaceAll("\\d|\\s", "");
		System.out.println(s2);
		
		s1 = "우리 ABC 123 x나라 45 tt대한";
		s2=s1.replaceAll("[a-zA-z]", "");//영문자
		System.out.println(s2);
		
		s1 = "우리 ABC 123 x나라 45 tt대한";
		s2=s1.replaceAll("\\w", "");//영문자,숫자,_
		System.out.println(s2);
		
		//숫자가 아닌것을 *로 치환
		s1 = "우리 ABC 123 x나라 45 tt대한";
		s2=s1.replaceAll("[^0-9]", "*");//[^]: 반대
		System.out.println(s2);
	}

}
