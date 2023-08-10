package ch12.unit04;

import java.util.HashSet;
import java.util.Set;

/*
 - Set
   :순서가 유지되지 않는 데이터의 집합
   :중복을 허용하지 않음
   :null도 하나만 저장 가능
   :구현클래스 - HashSet, LinkedHashSet, TreeSet
 */
public class Ex01_Set {
	public static void main(String[] args) {
		//HashSet : 입력한 순서가 유지되지 않는 Set. 동기화 지원 안함
		Set<String> set = new HashSet<String>();
		
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울"); // 동일한 데이터를 추가하면 기존 데이터를 덮는다.
		
		System.out.println(set);
		System.out.println();
		
		for(String s : set) {
			System.out.print(s+" ");
		}System.out.println();
	}

}
