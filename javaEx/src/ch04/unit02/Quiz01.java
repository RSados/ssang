package ch04.unit02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		char g;
		System.out.print("점수 ? ");
		n=sc.nextInt();
		
		
			
		
		switch(n/10) {
		case 10: g='수';break;
		case 9: g='수';break;
		case 8: g='우';break;
		case 7: g='미';break;
		case 6: g='양';break;
		default: g='가';
		
	}
	System.out.println("점수:"+n+", 판정:"+g);
		sc.close();
	}

}
