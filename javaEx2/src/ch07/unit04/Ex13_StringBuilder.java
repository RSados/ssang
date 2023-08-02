package ch07.unit04;

public class Ex13_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("seoul");
		StringBuilder sb2 = new StringBuilder("seoul");
		
		System.out.println(sb1==sb2);//false. 주소비교
		System.out.println(sb1.equals(sb2));//false. 주소비교
		
		//문자열 비교 => String 변환 후 비교
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		//다른 객체와 문자열 비교
		String s = "seoul";
		//System.out.println(s==sb1);//컴파일 에러.다른 클래스 객체는 비교불가
        System.out.println(s.equals(sb1.toString()));	//true
        System.out.println(s.contentEquals(sb1));//true. 문자열에만 사용가능
             //contentEquals() : 다른 객체와 문자열 비교
		
        // StringBuilder 의 문자열 길이
		System.out.println(sb1.length());//문자열 길이
		
		//기본 버퍼의 크기
		StringBuilder sb3 = new StringBuilder();
		System.out.println("기본버퍼크기 : "+sb3.capacity());
		
		//뒤에 문자열 추가
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");
		
		System.out.println("버퍼크기 : "+sb3.capacity());
		System.out.println(sb3);
		System.out.println(sb3.toString());
		System.out.println(sb3.toString().toUpperCase());
		
		//seoul 앞에 한국을 삽입
		sb3.insert(0, "한국");
	    System.out.println(sb3);
	    
	    //korea 뒤에 "사랑" 삽입
	    System.out.println(sb3.indexOf("korea"));//7
	    sb3.insert(sb3.indexOf("korea")+"korea".length(), "사랑");
	    System.out.println(sb3);
	    
		//대한민국 삭제
	    // delete(s,e) : s인덱스에서 e-1인덱스까지 삭제
	    sb3.delete(sb3.indexOf("대한민국"), sb3.indexOf("대한민국")+"대한민국".length());
	    System.out.println(sb3.toString());
	    
	    sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라")+"우리나라".length());
	    System.out.println(sb3.toString());
		
		//korea 부터 뒤의 모든 문자열 삭제
	    sb3.delete(sb3.indexOf("korea"), sb3.length());
	    System.out.println(sb3.toString());
	    
	    System.out.println("버퍼크기 : "+sb3.capacity());
	    
	    //버퍼의 크기를  문자열 크기로 변경
	    sb3.trimToSize();
	    System.out.println("버퍼크기 : "+sb3.capacity());
	    
	    //모든 문자열 지우기
	    sb3.delete(0, sb3.length());
	    System.out.println("모두삭제후:"+sb3);
		
		
		
	}

}
