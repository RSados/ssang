package ch02.unit03;

import java.util.Scanner;

public class Ex13_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String tel;
		String addr;
		
		System.out.print("이름 ? ");
		name = sc.nextLine();
		//nextLine():엔터까지 입력 받아 엔터를 버린 결과를 반환
		//          :중간에 공백도 입력 가능
		
		System.out.print("나이 ? ");
		age = sc.nextInt();//넥스트 인트에는 엔터를 받지 못해서 멀뚱히 남은 엔터가 다음으로 들어가버림
		sc.nextLine();//이줄이 없으면 넥스트인트 마지막에 엔터가 tel로 들어가서 그냥 넘어가버림(엔터를 읽어서 버리는역활)
		
		System.out.print("전화번호 ? ");
		tel = sc.nextLine();
		
		System.out.print("주소 ? ");
		addr = sc.nextLine();
		
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("전화번호 :" + tel);
		System.out.println("주소 :" + addr);
		
sc.close();
	}

}
