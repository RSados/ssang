package ch04.unit02;

import java.util.Scanner;

//1~3사이의 수를 입력 받아 입력 받은 수 만큼*찍기
public class Ex01_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("수 ? ");
		n=sc.nextInt();
				
		//switch : byte,short,char,int,string,enum만 가능
				//:boolean,long,float,double는 불가능
		switch(n) {//switch(변수 또는 수식)
		case 3:System.out.print("*");//하나 성립되면 끝까지 다 실행
		case 2:System.out.print("#");
		case 1:System.out.print("@");
		}
		System.out.println();
		sc.close();
	}

}
