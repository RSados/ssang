package ch04.unit03.forEx;

public class Ex05_for {
	public static void main(String[] args) {
		/*
		int s,n;
		s=0;
		
		for(n=1;n<=10;n++) {
			s+=n;
			System.out.println(n+":"+s);
		}
		System.out.println("밖:"+n+","+s);//11,55
		*/
		/*
		int s=0;
		for(int n=1;n<=10;n++) {
			s+=n;
		}
		System.out.println("밖:"+n+","+s);//컴파일 에러 
		//for문 안에서 선언한 변수는 밖에서 사용불가
		System.out.println(s);*/
		
		/*
		int s, n;
		for(n=1,s=0;n<=10;s+=n,n++)
			;
		System.out.println("밖:"+n+","+s);//11,55*/
		
		//잘못 코딩 예
		int n,s;
		s=0;
		for(n=1;n<=10;n++);
		s+=n;
		System.out.println("밖:"+n+","+s);
	}

}
