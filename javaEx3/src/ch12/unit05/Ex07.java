package ch12.unit05;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex07 {
	public static void main(String[] args) {
		Properties p = new Properties();
		
		// 값 저장(키,값)//무조건 문자열만 가능
		p.setProperty("자바", "95");
		p.setProperty("스프링", "90");
		p.setProperty("서블릿", "85");
		p.setProperty("오라클", "90");
		p.setProperty("HTML", "100");
		
		// Properties에 저장된 내용을 파일에 저장
		//FileOutputStream : 파일 출력 바이트 스트림
		
		String pathname = "subject.Properties";
		try (FileOutputStream fos = new FileOutputStream(pathname)){
			//파일에 저장하기(영어나 숫자 이외는 유니코드로 저장)
			p.store(fos, "과목별 성적");
			
			System.out.println("파일 저장 완료...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
