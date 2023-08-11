package ch12.unit05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
  - entry
    : 키와 값을 set 형태로 저장
    : key와 value를 묶어주기 위해 사용
    
  - Map.Entry 인터페이스
    : 맵의 앤트리. 키와 값의 한쌍(페어)  
 */
public class Ex05_entry {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("자바", 100);
		map.put("오라클",95);
		map.put("스프링", 95);
		map.put("자바스크립트", 80);
		map.put("HTML", 90);
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
		
		
		
	}

}
