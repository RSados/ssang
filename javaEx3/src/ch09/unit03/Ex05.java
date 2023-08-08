package ch09.unit03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {
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
			
			// 모든 예외를 catch
		} catch (Exception e) {
			// Exception 
			//   : 모든  예외를 catch
		    //   : Exception 으로 모든 예외를 catch 하므로 예외 상황 예외를 별로 분리할 수 없음
	        // e.printStackTrace();
			System.out.println("연산 불가능합니다.");
		}    
	    System.out.println("end...");
		
	}

}
