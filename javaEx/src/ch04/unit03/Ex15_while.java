package ch04.unit03;

//1/2+2/3+...+9/10의 결과
public class Ex15_while {
	public static void main(String[] args) {
		int n;
		double s;
		n=0;
		s=0;
		while(n<9) {
			s+=(double)n/++n;
			
			
		}
		System.out.println("합은"+s);
	}
	

}
