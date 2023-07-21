package ch04.unit03;

public class Quiz04 {
	public static void main(String[] args) {
		int count,p,n;
		count=p=0;
		n=0;
		while(n<100) {
			n++;
			if(n%3==0) {
				p+=n;
				count++;
			}
			else if(n%5==0) {
				p+=n;
				count++;
			}
			
		}
		System.out.printf("합 : %d\n평균 : %d",p,(int)(p/count));
	}

}
