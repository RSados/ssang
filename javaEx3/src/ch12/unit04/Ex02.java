package ch12.unit04;

import java.util.LinkedHashSet;
import java.util.Set;

public interface Ex02 {
	public static void main(String[] args) {
		//LinkedHashSet : 중복허용하지 않음.순서를 유지
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울"); // 중복 데이터는 덮는다.
		
		for(String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		
		
		
	}

}
