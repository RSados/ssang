package ch12.unit07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_Shuffle {
	public static void main(String[] args) {
		//Shuffle 구현
		List<String>list = new ArrayList<String>();
		list.add("java");
		list.add("spring");
		list.add("html");
		list.add("css");
		list.add("javascript");
		
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
