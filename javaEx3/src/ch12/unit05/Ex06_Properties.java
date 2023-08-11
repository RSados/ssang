package ch12.unit05;

import java.util.Iterator;
import java.util.Properties;

/*
 - Properties
   : HashTable 클래스를 상속 받음
   : 키와 값이 모두 문자만 가능
   : 파일 저장 및 불러오기가 간단하여 환경 설정 등에서 많이 사용
 */
public class Ex06_Properties {
	public static void main(String[] args) {
		Properties p = new Properties();
		
		// 값 저장(키,값)//무조건 문자열만 가능
		p.setProperty("스프링", "90");
		p.setProperty("서블릿", "85");
		p.setProperty("오라클", "90");
		p.setProperty("HTML", "100");
		
		//프로퍼티에 저장된 값 가져오기
		String k,s;
		k="스프링";
		s=p.getProperty(k);
		System.out.println(k + " -> " + s);
		
		System.out.println("전체...");
		Iterator<Object> it = p.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			String value = p.getProperty(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		
	}

}
