package ch07.unit06;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 난수를 발생하여 20번 안에 맞추기 발생된 난수 : 73 수 ? 50 50보다는 큰수입니다. 수 ? 80 80보다는
		 * 작은수입니다. 수 ? 73 3번에 성공했습니다. or 실패했습니다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int n, s,c=0;
		//1~100사이의 난수
		n = rnd.nextInt(100)+1;
		for (int i = 0; i < 20; i++) {
			System.out.print("수 ? ");
			s = sc.nextInt();
			c++;
			if (s < n) {
				System.out.println(s + "보다는 큰수입니다.");
			}
			if (s > n) {
				System.out.println(s + "보다는 작은수입니다.");
			}
			if(s==n) {
				System.out.println(c+"번에 성공했습니다.");
				break;
			}
			/*
			 do{
			 System.out.print("수 ? ");
			 s = sc.nextInt();
			 			if (s < n) {
				System.out.println(s + "보다는 큰수입니다.");
			}
			if (s > n) {
				System.out.println(s + "보다는 작은수입니다.");
			}
				count++;
			 }while(input !=n && count<20
			 
			 System.out.println("발생된 난수 : "+c);
			 
			 if(성공 실패---

			 
			 */

		}
		if(c==20) {
			System.out.println("실패");
		}
		sc.close();

	}

}
