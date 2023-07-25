package ch04.unit05;

public class Ex04_continue {
	public static void main(String[] args) {
		//2~100 사이의 소수
		int count=0;
		gogo:
		for(int n=2; n<=100; n++) {
			for(int i=2; i<=(n/2);i++) {
				if(n%i==0) {
					continue gogo;
				}
			}
			System.out.printf("%5d",n);
			count++;
			if(count%10==0) {
				System.out.println();
			}
		}
	}

}
