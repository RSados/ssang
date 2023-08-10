package ch12.unit03;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Ex01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("스프링");
		list.add("오라클");
		
		System.out.println("전체-1");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("\n전체-2");
		ListIterator<String> it2 = list.listIterator();
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("\n역순-1");
		for(int i = list.size()-1;i>=0;i--) {
			String s = list.get(i);
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("\n역순-2");
		ListIterator<String> it3 = list.listIterator(list.size());
				//가장 뒤로 반복자 이동
		while(it3.hasPrevious()) {
			String s = it3.previous();
			System.out.print(s+ " ");
		}
		System.out.println();
		
		Vector<String> vv = new Vector<String>();
		vv.add("서울");
		vv.add("부산");
		vv.add("제주");
		
		Enumeration<String> e = vv.elements();
		System.out.println("벡터 전체-1");
		while(e.hasMoreElements()) {
			String s =e.nextElement();
			System.out.print(s+ " ");
		}
		System.out.println();
		
		System.out.println("벡터 전체-2");
		Iterator<String> it4 = vv.iterator();
		//향상된 for문도 가능
		while(it4.hasNext()) {
			String s =it4.next();
			System.out.print(s+" ");
		}
		System.out.println();
		
	}

}
