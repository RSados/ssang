package ch04.unit03;

public class Ex01_while {
	public static void main(String[] args) {
/*
		n=0;//초기화가 필요
		 while(n<10) {
			 n++;
			 System.out.print(n+" ");//1~10
		 }
		 System.out.println();
		 System.out.println(n);//10
	*//*
	int n=0;
	while(n++<10) {
		System.out.print(n+" ");
	}
	 System.out.println();//1~10
	 System.out.println(n);//11*/
		/*
	int n= 0;
	while(++n<10) {
	System.out.print(n+" ");
}
 System.out.println();//1~9
 System.out.println(n);//10*/
		int n;
		n=10;
		while(n<10) {//처음 조건식이 거짓이면 while문 안은 한번도 실행 안함
			n++;
			System.out.print(n+"안");
		}
		 System.out.println();
		 System.out.println("밖"+n);//10
		
}
	}
