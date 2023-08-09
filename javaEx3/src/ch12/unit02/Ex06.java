package ch12.unit02;

import java.util.Arrays;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "c", "b", "a", "d", "x", "d");
		System.out.println(list);
		
		System.out.println("중복 배제 출력");
		for(int i=0;i<list.size();i++) {
			if(list.indexOf(list.get(i))==i) {
				System.out.print(list.get(i)+" ");
			}
		}
		System.out.println();
	}

}
