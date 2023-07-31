package ch04.unit03.forEx;

public class QuizH06 {
	public static void main(String[] args) {
		int a;
		a=0;
		for(int i=4;i<=1000;i++) {
			for(int j=1;j<=i-1;j++) {
				if(i%j==0) {
					a+=j;
				}

			}
			if(i==a) {
				System.out.print(i+" ");}
			a=0;	
			}

			}
		}
	

