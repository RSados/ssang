package ch03.unit01;

/*
 -가로와 세로의 길이를 입력 받아 직사각형의 넣ㅂ이 및 둘레 계산하기
 가로? 10
 세로 ? 5
 넓이 : 50
 둘레 : 30
 */
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int a,b;
		
		System.out.print("가로 ? ");
		a = sc.nextInt();
		System.out.print("세로 ? ");
		b = sc.nextInt();
		System.out.printf("넓이 : %d\n둘레 : %d",a*b,2*(a+b));*/
		
		int height, width;
		int a,b;
		
		System.out.print("가로 ? ");
		width = sc.nextInt();
		System.out.print("세로 ? ");
		height = sc.nextInt();
		
		a=width*height;
		b=(width+height)*2;
		
		System.out.println("넓이 : "+a);
		System.out.println("둘레 : "+b);
		
		sc.close();
		
		
	}

}
