package ch04.unit03;

public class Ex16_while {
	public static void main(String[] args) {
		//1~100까지 수중 홀수를 한줄에 5개씩 출력하고 마지막에 합 출력
		int a, b,c;
		a=b=c=0;
		while(a<100) {
			a++;
			if(a%2==1) {
				System.out.print(a+"\t");
				b+=a;
				c++;
				if(c%5==0) {
					System.out.println(); {
						
					}
				}
			}}
			System.out.println("합은 "+b);
		
		
		
		
		
		
		
	}

}
