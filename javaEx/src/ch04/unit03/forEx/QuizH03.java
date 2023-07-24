package ch04.unit03.forEx;

public class QuizH03 {
	public static void main(String[] args) {
		int a,b,c;
		for(a=1;a<=9;a++) {
			for(b=1;b<=9;b++) {
				for(c=1;c<=9;c++) {
					if(a+b+c==25) {
						System.out.printf("%d+%d+%d==25\n",a,b,c);
					}
				}
			}
		}
	}

}
