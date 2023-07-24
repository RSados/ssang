package ch04.unit03.forEx;

public class QuizH05 {
	public static void main(String[] args) {
		int count=0,a=0;
		for(int i=2; i<=100;i++) {
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+"\t");
				a++;
				if(a%10==0) {
					System.out.println();}
			}else {
			count=0;}
		}
		System.out.println("\n소수의 개수 : "+a);
	}

}
