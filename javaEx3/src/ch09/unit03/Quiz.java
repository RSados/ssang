package ch09.unit03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 예외처리를 활용한 사칙연산 프로그램 작성 첫번째 수 ? 10 두번째 수 ? 10 연산자 ? + 10 + 10 = 20
		 */

		Calculate obj = new Calculate();
		obj.clac();
	}
}

class Calculate {
	private Scanner sc = new Scanner(System.in);

	public void clac() {
		String s;
		int a, b;
		try {

			System.out.print("첫번째 수 ? ");
			a = inputScore();
			System.out.print("두번째 수 ? ");
			b = inputScore();
			System.out.print("연산자 ? ");
			s = inputS();

			switch(s) {
			case "*" :System.out.println(a*b);break;
			case "/" :System.out.println(a/b);break;
			case "+" : System.out.println(a+b);break;
			case "-" :System.out.println(a-b);break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private int inputScore() throws Exception {
		int s = 0;

		try {
			s = Integer.parseInt(sc.next());

		} catch (NumberFormatException e) {
			throw new Exception("점수는 숫자만 가능합니다.");

		}catch (ArithmeticException e) {
			throw e;
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		return s;

	}
	
	private String inputS()throws Exception{
		String m;
		try {
			m=sc.next();
			if(m.equals("*")&m.equals("-")&m.equals("+")&m.equals("/")) {
				throw new Exception("사칙연산이 아닙니다");
			}

		} catch (Exception e) {
	      e.printStackTrace();
			throw e;	
		}
		return m;
	}
}
