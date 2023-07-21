package ch04.unit03;

public class Ex09_while {
	public static void main(String[] args) {
		int n;
		/*
		n=10;
		while(n<10) {//처음 조건이 거짓이므로 while안을 한번도 실행 안함
			n++;
			System.out.println("안:"+n);
		}
		System.out.println("밖:"+n);*/
		//do~while은 적어도 한번은 실행
		n=10;
		do {//한번실행
			n++;
			System.out.println("안:"+n);//안:11
		}while(n<10);
		System.out.println("밖:"+n);//밖:11
	}

}
