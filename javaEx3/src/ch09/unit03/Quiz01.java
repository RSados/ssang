package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 예외처리를 활용한 사칙연산 프로그램 작성 첫번째 수 ? 10 두번째 수 ? 10 연산자 ? + 10 + 10 = 20
		 */

		Calculate2 obj = new Calculate2();
		obj.clac();
	}
}

class OpreatorException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public OpreatorException(String msg) {
		super(msg);
	}
}

class Calculate2 {
	private Scanner sc = new Scanner(System.in);

	public void clac() {
		int a,b;
		String op;
		try {
			System.out.print("첫번째 수 ? ");
			a=sc.nextInt();
			System.out.print("두번째 수 ? ");
			b=sc.nextInt();
			System.out.print("연산자 ? ");
			op = sc.next();
			
			String s = result(a,b,op);
			System.out.println(s);
		}catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("숫자만 입력 가능합니다.");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}catch (OpreatorException e) {
			//System.out.println("연산자는 +, -, *, / 만 가능합니다.");
			System.out.println(e.getMessage());
		}catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
	private String result(int a, int b, String op) throws OpreatorException {
		int n=0;
		String s = null;
		
		try {
			switch(op) {
			case"+":n=a+b;break;
			case"-":n=a+b;break;
			case"/":n=a+b;break;
			case"*":n=a+b;break;
			default : throw new OpreatorException("연산자 입력 오류 입니다.");
			}
			s=String.format("%d %s %d = %d", a,op,b,n);
		} catch (ArithmeticException e) {
			// 0으로 나누는 경우
			throw e;
		}

		
		return s;
	}
}