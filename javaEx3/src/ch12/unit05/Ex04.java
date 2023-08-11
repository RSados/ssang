package ch12.unit05;

import java.util.Map;
import java.util.TreeMap;

public class Ex04 {
	public static void main(String[] args) {
		//Map<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("자바", 100);
		map.put("오라클",95);
		map.put("스프링", 95);
		map.put("자바스크립트", 80);
		map.put("HTML", 90);
		System.out.println(map);
		
		//스프링에서 자바 전까지
		Map<String, Integer> map2 = map.subMap("스프링", "자바");
		System.out.println(map2);
		
		
		
		
		
		
		
		
		
	}

}
