package ch07.unit07;

import java.text.MessageFormat;

public class Ex05_MessageFormat {
	public static void main(String[] args) {//데이터를 양식에 맞춰 출력
		String s = "이름 : {0} \t 전화 : {1} \t 나이 : {2}";
		Object[] objs = {"자바", "010-1111-2222",20};
		
		String result = MessageFormat.format(s, objs);
		System.out.println(result);
		
		
	}

}
