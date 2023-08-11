package ch12.unit05;

import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		//불변
		Map<String, Integer> map = Map.of("자바",100);
		System.out.println(map);
		
		//map.put("웹", 85);//런타임 오류
		
		Map<String, Integer> map2 = Map.of("a", 100, "b", 95);
		System.out.println(map2);
		
		
		
		
	}

}
