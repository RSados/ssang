package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) {
		// 버퍼를 이용하여 문자(열)을 입력 - 입력 속도 향상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    int a,b,c;
	    try {
	    	System.out.print("첫번째 수 ? ");
			s = br.readLine();
			a = Integer.parseInt(s);
			
			System.out.print("두번째 수 ? ");
			s = br.readLine();
			b = Integer.parseInt(s);
			
			c = a / b;
			System.out.println( a + "/" + b + "=" + c);
			
			// 예외 상황별로 예외를 catch
		} catch (IOException e) { // checked exception
			e.printStackTrace();//에러 메시지를 표준 출력 장치로 출력
		} catch (NumberFormatException e) {
			// unchecked exception
			//    : 문자열을 숫자로 변환하지 못하는 경우 등에서 발생하는 예외
			//    : NumberFormatException 예외를 catch 하지 않으면 예외가 발생한 경우 프로그램은 비정상적인 종료
			
			//System.out.println("숫자만 입력 가능합니다.");
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// unchecked exception
			//  : 0으로 숫자를 나누는 경우 등에서 발생
			System.out.println("0으로 숫자를 나눌수 없습니다.");
		} catch (Exception e) {
			// Exception 
			//   : 모든  예외를 catch
			//   : 여러 예외를 동시에 catch 하는 경우 가장 마지막에 위차해야한다
	        e.printStackTrace();
		}    
	    System.out.println("end...");
		
	}

}
