package ch07.unit04;

public class Ex12_StringBuffer {
	public static void main(String[] args) {
		//아래처럼 문자열을 결합하면 시스템 성능 저하의 요인
		/*
		String s;
		
		s="서울,";
		s+="부산,";
		s+="대구,";
		s+="인천,";
		s+="광주,";
		s+="대전";
		*/
			
		// 아래의 코딩은 내부적으로 StringBulider를 이용하여 문자열을 결합하므로
		//성능이 우수
		/*
		String s;
		
		s="서울,"
		+"부산,"
		+"대구,"
		+"인천,"
		+"광주,"
		+"대전";
		*/
		
		StringBuffer sb1 = new StringBuffer("seoul");
		StringBuffer sb2 = new StringBuffer();
		
		sb1.append("korea"); //뒤에 문자열 추가
		
		sb2.append("seoul");
		sb2.append("korea");
		
		System.out.println(sb1);//seoulkorea
		System.out.println(sb2);//seoulkorea
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
		//StringBuliser, StringBufer 클래스의 equals()메소드는 주소를 비교한다.
		//따라서 문자열을 비교하기 위해서는 String 으로 변환후 비교해야 한다.
		
		//Object의 equals() : 주소 비교
		//String equals() : 문자열 비교
		
		//StringBuliser, StringBufer 클래스의 String 변환
	    String s1 = sb1.toString();
	    String s2 = sb2.toString();
	    
	    System.out.println(s1.equals(s2));
		
	}

}
