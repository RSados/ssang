package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) {
		// 버퍼를 이용하여 문자(열)을 입력 - 입력 속도 향상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    int a,b,c;
	    try {
	    	System.out.println("첫번째 수 ? ");
			s = br.readLine();
			    // readLine() 는 IOException(checked exception) 예외가 발생하므로 반드시
			    //   예외처리를 해야함
			a = Integer.parseInt(s);
			    // 문자열을 숫자로 변환하지 못하면
			    //    NumverFormatException 예외(unchecked exception)가 발생
			
			System.out.println("두번째 수 ? ");
			s = br.readLine();
			b = Integer.parseInt(s);
			
			c = a / b;
			     // 0으로 나누면 ArithmeticException 예외(unchecked exception) 발생
			System.out.println( a + "/" + b + "=" + c);
		} catch (IOException e) {
			// IOException : 입출력에 문제가 발생할 때 발생하는 예외(checked exception)
			// checked exception은 메소드를 정의할 때 throws 한 예외
			// checked exception은 예외 처리를 하지 않으면 컴파일 예외가 발생
			
			e.printStackTrace();//에러 메시지를 표준 출력 장치로 출력
		}
	    System.out.println("end...");
		
	}

}
