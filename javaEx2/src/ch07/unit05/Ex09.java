package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09 {
	public static void main(String[] args) {
		Date now = new Date();
		String birth = "1999-08-31";
		String a="2023-12-25";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sdf.parse(birth);
			Date vv = sdf.parse(a);

			//두 날짜 사이의 간격(일)
			long diff = (now.getTime() - date.getTime())/(1000*60*60*24);
			System.out.println("살아온날수 : "+diff);
			
			long ss = (vv.getTime() - now.getTime())/(1000*60*60*24);
			System.out.println("크리스마스까지 남은날수 : "+ss);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
