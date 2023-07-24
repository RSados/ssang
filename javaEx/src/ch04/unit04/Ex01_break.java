package ch04.unit04;

public class Ex01_break {
	public static void main(String[] args) {
		
	
	//break:while,do~while,for,switch~case
	
	int n,s;
	
	n=s=0;
	while(true) {
		n++;
		s+=n;
		if(n>=100) {
			break;//반복문 또는 switch문을 빠져 나감
		}
	}
	System.out.println("결과: "+s);
	}
}
