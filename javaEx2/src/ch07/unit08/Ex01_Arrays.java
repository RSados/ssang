package ch07.unit08;

import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;

public class Ex01_Arrays {
	public static void main(String[] args) {
		String []ss = {"자바","스프링","오라클","서블릿","자바스크립트","프론트","백엔드"};
		String s;
		
		//배열 각 요소를 "[값1, 값2...]" 형식의 문자열로 반환
		s = Arrays.toString(ss);
		System.out.println(s);
		System.out.println();
		
		//오름차순 정렬
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		
		//내림차순
		Arrays.sort(ss, Collections.reverseOrder());
		System.out.println(Arrays.toString(ss));
		
	   // Object[] oo = {"자바",50,"스프링",45};
	    //Arrays.sort(oo);//서로 다른 객체 타입이 있어서 런타임 오류
		
	
	}

}
