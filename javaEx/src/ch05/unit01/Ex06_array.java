package ch05.unit01;

import java.util.Scanner;

/*
 5명의 이름과 정수를 입력 받아 편차(점수-평균)를 출력하고 
 마지막에 총점과 평균 출력
 실행예
 1번째 이름 ? aa 
      점수 ? 100
 2번째 이름 ? bb
      점수 ? 90
      :
 5번째 이름 ? ee
      점수 ? 90
   이름 점수 편차
   aa 100 x
   bb 90  x
       :
   총점:xx
   평균:yy
 */
public class Ex06_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a[]=new String[5];
		int b[]=new int[5];
		int c=0,d=0;
		for(int i=0;i<a.length;i++) {
			System.out.print((i+1)+"번째 이름 ? ");
			a[i]=sc.next();
			System.out.println((i+1)+"번째 점수 ? ");
			b[i]=sc.nextInt();
			c+=b[i];
		}
		d=c/5;
		System.out.println("이름\t점수\t편차");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"\t"+b[i]+"\t"+(b[i]-d));
		}
		System.out.println("총점: "+c+",평균: "+d);
		
		sc.close();
		
		
		
		
	}

}
