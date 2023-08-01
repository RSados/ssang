package ch07.unit04;

/*
 -String 클래스
   : 문자열을 나타내는 클래스
   : 문자열을 상수풀(String constant pool)에 저장
     상수풀에서 intern() 메소드로 해당 문자열을 검색하여 문자열이 존재하면 문자열의 주소 반환
     문자열이 존재하지 않으면 객체를 추가하여 새로운 참조값을 반환
   : 내용불변(immutable)  
     Integer, Long, Double 등의 Wrapper 클래스도 내용 불변
     내용이 변경되면 새로운 영역에 메모리를 할당 받아 저장하고 기존 인스턴스는 GC의 대상이 된다.
   : String 클래스는 final 클래스 이므로 하위 클래스를 가질 수 없다.
 */


public class Ex01_String {
	public static void main(String[] args) {
		//상수풀에 동일한 문자열이 존재하면 해당 문자열의 주소를 반환
		String s1 = "seoul";
		String s2 = "seoul";
		
		//새로운 객체를 생성하여 문자열을 설정
		String s3 = new String("seoul");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//==는 문자열을 비교하지 않고 문자열이 저장된 주소를 비교한다
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		
		//동일한 객체는 해쉬코드가 같지만 해쉬코드가 같다고 동일 객체는 아니다.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//문자열은 불변이다.절대 값을 바꿀수 없다
		//즉, 문자열이 변경되면 기존의 문자열을 변경하는것이 아니라
		//   새로운 영역에 메모리를 할당 받아 처리한다.//뭐를 추가하면 기존집이 아닌 다른 집으로 이사가야함
		s1+="korea";//처리속도 느려서 +=안씀
		System.out.println(s1);//seoulkorea
		System.out.println(s2);//seoul
		
		System.out.println(s1==s2);//이제 다른 객체가 되어버림
		
		//길이가 0인 문자열
		String s4 = "";//메모리 할당 받은상태
		System.out.println(s4.length());//length(): 문자열 길이 반환
		
		//s4 = null;//메모리 할당을 받지 못한상태
		//System.out.println(s4.length());//런타임 오류
		//s4가 null이므로 객체가 생성된것이 아니다.메모리 할당도 못받음
		//따라서 인스턴스 메소드나 인스턴스 변수를 접근할 수 없다.
		
		
	}

}
