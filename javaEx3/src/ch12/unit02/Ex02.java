package ch12.unit02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex02 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		System.out.println("전체출력 - 1");
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n");
		
		System.out.println("전체출력 - 2");
	    for(String s : list) {
	    	System.out.print(s + " ");
	    }
	    System.out.println("\n");
		
	    System.out.println("전체출력 - 3 : 반복자");
		Iterator<String> it = list.iterator();
		//Iterator : 순방향만 검색
		while(it.hasNext()) {//데이터가 존재하면 true 없으면 false
			String s = it.next();
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
	    System.out.println("전체 역순 출력 - 1");
	    for(int i = list.size()-1; i>=0;i--) {
	    	System.out.print(list.get(i)+" ");
	    }
	    System.out.println("\n");

	    //ListIterator : 순방향과 역방향 검색이 모두 가능
	    System.out.println("전체 역순 출력 - 2");
	    ListIterator<String> it2 = list.listIterator(list.size());
	                             //반복자의 위치를 가장 마지막으로 이동
	    while(it2.hasPrevious()) {
	    	String s = it2.previous();
	    	System.out.print(s+" ");
	    }
	    System.out.println("\n");
	    
	    
	    
	    
	    
	}

}
