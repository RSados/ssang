package ch04.unit03.forEx;

public class QuizH04 {
	public static void main(String[] args) {
		int b=0;
		for(int a=1;a<=10;a++) {
			System.out.print(a+" ");
			if(a%2==1&&a<10) {
				System.out.print("- ");
				b-=a;
			}
			if(a%2==0&&a<10) {
				System.out.print("+ ");
				b+=a;
			}
			
			
		}
		System.out.println("= "+ b);
	}

}
