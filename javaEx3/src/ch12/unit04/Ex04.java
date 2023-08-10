package ch12.unit04;

import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		//1~45 사이의 난수를 6개 발생. 로또 작성
		Set<Integer> set = new TreeSet<Integer>();
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}
}
