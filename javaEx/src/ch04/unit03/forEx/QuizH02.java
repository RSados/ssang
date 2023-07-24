package ch04.unit03.forEx;

public class QuizH02 {
	public static void main(String[] args) {
		int a,b;
		for(a=0;a<=10;a++) {
			for(b=0;b<=10;b++) {
				if(3*a+6*b==27) {
					System.out.println("["+a+","+b+"]");
				}
			}
		}
	}

}
