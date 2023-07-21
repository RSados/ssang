package ch04.unit03;

public class Quiz05 {
	public static void main(String[] args) {
		int n,a;
		n=a=0;
		while(a<100) {
			n+=1;
			a+=n;
		}
		System.out.println("최소의 n : "+n);
		System.out.println("합 : "+a);
	}

}
