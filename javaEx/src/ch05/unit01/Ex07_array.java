package ch05.unit01;

public class Ex07_array {
	public static void main(String[] args) {
		//1~100 사이의 서로 다른 난수 10개 출력하기
		//잘못 코딩한 예
		/*
		 
		int n;
	    for(int i=0;i<10; i++) {
	    	n=(int)(Math.random()*100)+1;
	    	System.out.print(n+" ");
	    }
	    System.out.println();*/
		int []a = new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
					break;
				}
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
