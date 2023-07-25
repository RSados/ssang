package ch04.unit03.forEx;

public class QuizH07 {
	public static void main(String[] args) {
		int dan,n,c=0;

		for(n=1;n<=9;n++) {
			if(c==0){
			for(dan=2;dan<=5;dan++) {
				System.out.printf("%d*%d=%d\t",dan,n,dan*n);
				if(n==9&&dan==5) {
					n=1;
					c=1;
					System.out.println();
				}
				
			}}
			System.out.println();
			if(c==1) {
			for(dan=6;dan<=9;dan++) {
				System.out.printf("%d*%d=%d\t",dan,n,dan*n);}
			}
		
	}

}}
