package ch04.unit03;

public class Quiz03 {
	public static void main(String[] args) {
		char c='A';
		int n=0;
		while(c<='Z') {
			System.out.print(c+" ");
			n++;
			c++;
			if(n%5==0) {
				System.out.println();
			}
	}
	}
}
