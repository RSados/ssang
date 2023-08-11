package ch12.unit05;

import java.io.FileInputStream;
import java.util.Properties;

public class Ex08 {
	public static void main(String[] args) {
		String pathname = "subject.Properties";
		Properties p = new Properties();
		
		//파일에 저장된 properties 파일 읽어오기
		//FileInputStream
		//	:파일의 내용을 읽어 내는 바이트 스트림
		//	:파일이 없으면 FileNotFoundException 발생
		try(FileInputStream fis = new FileInputStream(pathname)) {
			
			//파일의 내용을 읽어 properties에 저장
			p.load(fis);
			
			//properties 내용 전체를 콘솔에 출력
			p.list(System.out);
			
			String s = p.getProperty("자바");
		    System.out.println(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
