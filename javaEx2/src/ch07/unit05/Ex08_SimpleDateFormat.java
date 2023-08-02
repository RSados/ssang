package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_SimpleDateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		
		//SimpleDateFormat : 문자열 <-> Date
		
		//Date 객체를 문자열로 반환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String s = sdf.format(date);
		
		System.out.println(s);
		
	}

}
