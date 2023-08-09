package ch12.unit02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("자바");
		list1.add("오라클");
		list1.add("서블릿");
		print(list1);
		System.out.println();
		
		List<String> list2 = new LinkedList<String>();
		list2.add("서울");
		list2.add("부산");
		list2.add("인천");
		print(list2);
		
	}
	
	
	public static void print(List<String>list) {
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
