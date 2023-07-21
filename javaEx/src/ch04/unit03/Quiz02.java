package ch04.unit03;

public class Quiz02 {
	public static void main(String[] args) {
		int a=0,b=0;
		
		while(a<10) {
			a+=1;
			b+=a;
			a+=1;
			b-=a;
			
		}
		System.out.println("결과 : "+ b);
	}

}
