package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		String g;
		System.out.print("두수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("연산자[+,-,*,/] ? ");
		g=sc.next();
		
		switch(g) {
		case "+":c=a+b;break;
		case "-":c=a-b;break;
		case "*":c=a*b;break;
		case "/":c=a/b;break;
		default:g="연산자 입력 오류";break;
		}
		System.out.printf("%d%s%d=%d",a,g,b,c);
		//String으로 받으니 그냥 case안에서 g에 넣어도 됨 왜 그러냐면 오류때문에
		
		
		
		sc.close();
	}

}
