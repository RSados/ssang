package ch12.unit07;

import java.util.ArrayList;
import java.util.List;

public class Ex01_Shuffle {
	public static void main(String[] args) {
		//Shuffle 구현
		List<String>list = new ArrayList<String>();
		list.add("java");
		list.add("spring");
		list.add("html");
		list.add("css");
		list.add("javascript");
		
		System.out.println(list);
		
		String s;
		int n;
		
		for(int i=0;i<list.size();i++) {
			n=(int)(Math.random() * list.size());
			if(n!=i) {
				s=list.get(i);
				list.set(i, list.get(n));
				list.set(n, s);
			}else {
				i--;
			}
		}
		System.out.println(list);
	}

}
