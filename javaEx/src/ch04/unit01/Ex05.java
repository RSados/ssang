package ch04.unit01;

import java.util.Scanner;

/*
 정수 3개를 입력 받아 적은수에서 큰수 순으로 출력하기
 10 3 7
 3 7 10
 */

public class Ex05 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int a,b,c,d;
	  System.out.print("세개의 정수 ? ");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=sc.nextInt();
	  
	  if(a<=b) {
		  
	   if(a>=c){
		   d=a;
		   a=c;
		   c=b;
		   b=d;
		   }
	   else if(b>=c) {
		   d=c;
		   c=b;
		   b=d;
		  }
	   }
	   else if(a>=c) {
		   if(b>=c) {
			   d=a;
			   a=c;
			   c=d;
			   }
		   else {
			   d=b;
			   b=c;
			   c=a;
			   a=d;
		   }
	  
	  }
	  
	  /*
	   * if(a>b)
	   * 
	   * if (a>c)
	   * 
	   * if (b>c)
	   * 3문장으로 끝낼수 있음
	   */
	  System.out.println(a+","+b+","+c);
	  
	  sc.close();
}

}
