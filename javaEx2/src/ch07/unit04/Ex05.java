package ch07.unit04;

public class Ex05 {
	public static void main(String[] args) {
		//String 주요 메소드
		String s1 = "seoul korea";
		String s2;
		int n;
		
		//특정 문자열의 위치 구하기. 없으면 -1
		n=s1.indexOf("seoul");
		System.out.println(n);// 0, 처음에 위치
		System.out.println(s1.indexOf("kor"));//6
		System.out.println(s1.indexOf("KOR"));//-1, 없음
		
		n = s1.indexOf("o");// 처음부터 검색
		System.out.println(n);// 2
		
		n = s1.indexOf("o",6);// 6 인덱스부터 검색
		System.out.println(n);// 7
		
		n = s1.indexOf("e");
		System.out.println(n);// 1
		
		n = s1.lastIndexOf("e");// 끝부분 부터 검색
		System.out.println(n);// 9
		
		s2="abc.png";
		n= s2.lastIndexOf(".");
		System.out.println("파일명 : "+s2.substring(0,n));
		System.out.println("확장자 : "+s2.substring(n+1));
		
		
	}

}
