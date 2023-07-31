package ch06.unit03;

public class Ex11 {
	public static void main(String[] args) {
		Test11 t = new Test11();
		int s;
		
		s= t.sum(10);
		
		System.out.println("결과 : "+s);
	}

}

class Test11{
	public int sum(int n) {
		/*
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		return s;
		*/
		
		return n>=1? n+sum(n-1):0;
	}
}