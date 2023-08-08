package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		User14 uu = new User14();
		
		uu.input();
		uu.input();
		
	}

}


class User14 {
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		String name, tel;
		int kor, eng;
		
		try {
			System.out.print("이름 ? ");
			name = sc.next();
			
			System.out.print("국어 ? ");
			kor = inputScore();
			
			System.out.print("영어 ? ");
			eng = inputScore();
			
			System.out.print("전화번호 ? ");
			tel = sc.next();
			
			System.out.println(name+","+tel+","+kor+","+eng);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------------------");
	}
	
	private int inputScore()throws Exception{
		int s =0;
		
		try {
			s = sc.nextInt();
			if(s<0||s>100) {
				throw new Exception("점수는 0~100 사이만 가능합니다.");
			}
		} catch (InputMismatchException e) {
			//System.out.println("숫자만 입력 가능합니다.");
			
			//숫자가 아닌것을 입력하면 읽어서 버림
			sc.nextLine();
			
			//checked 예외를 발생 시킴
			throw new Exception("숫자만 입력 가능합니다");
		}
		
		return s;
	}
}