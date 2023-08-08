package ch09.unit03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15 {
	public static void main(String[] args) {
		User15 uu = new User15();
		
		uu.input();
		uu.input();
	}

}

class User15{
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void input(){
		String name,tel;
		int kor , eng;
		
		try {
			System.out.print("이름 ? ");
			name = br.readLine();
			
			System.out.print("국어 ? ");
			kor = inputScore();
			
			System.out.print("영어 ? ");
			eng = inputScore();
			
			System.out.print("전화번호 ? ");
			tel = br.readLine();
			
			System.out.println(name+","+tel+","+kor+","+eng);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	private int inputScore() throws Exception{
		int s =0;
		
		try {
			s = Integer.parseInt(br.readLine());
			
			if(s<0||s>100) {
				throw new Exception("점수는 0~100 사이만 가능합니다");
			}
		} catch (NumberFormatException e) {
			throw new Exception("점수는 숫자만 가능합니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
			
			throw e;//예외를 다시 던짐
		}
		return s;
	}
}