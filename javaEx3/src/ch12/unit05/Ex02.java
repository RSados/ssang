package ch12.unit05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// 키 값
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("자바", 95);
		map.put("오라클", 90);
		map.put("서블릿", 100);
		map.put("스프링", 85);
		map.put("웹", 90);

		// 키를 Set으로 반환
		Set<String> set = map.keySet();
		System.out.println(set);

		// map의 값을 List로 반환
		List<Integer> list = new LinkedList<Integer>(map.values());
		System.out.println(list);

		// 전체-1
		System.out.println("전체-1");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key + "->" + score);
		}
		System.out.println();

		// 전체-2
		System.out.println("전체-2");
		for (String subject : map.keySet()) {
			int score = map.get(subject);
			System.out.println(subject + " -> " + score);
		}
		System.out.println();

		// 최고 값/최저 값
		int max = Collections.max(map.values());
		int min = Collections.min(map.values());

		System.out.println(max + "," + min);

	}

}
