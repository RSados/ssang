package ch04.unit01;

import java.util.Scanner;

public class Ex06_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("정수 ? ");
		n=sc.nextInt();
		
		//잘못 작성한 경우
		/*if(n%2==0) {
			System.out.println(n+" :2의 배수");
		}else if(n%3==0) {
				System.out.println(n+": 3의 배수");
		}else if(n%3==0) {
				System.out.println(n+": 3의 배수");
		}else if(n%2==0&&n%3==0) {
				System.out.println(n+": 2또는 3의 배수");
		}else {
			System.out.println(n+": 2또는 3의 배수가 아님");
				
			}*/
	if(n%2==0&&n%3==0) {
		System.out.println(n+": 2또는 3의 배수");
	}else if(n%2==0) {
		System.out.println(n+" :2의 배수");
	}else if(n%3==0) {
			System.out.println(n+": 3의 배수");
	}else {
		System.out.println(n+": 2또는 3의 배수가 아님");
	}
		sc.close();
		}
	}


