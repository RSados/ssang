package ch03.unit01;

public class Ex03 {

	public static void main(String[] args) {
		// int 연산자 int => 결과는 int 
		int a;
		
		a= 3/2+1/2+2/4;//1+0+0 int는 정수형이라서 소수 이런거 안받음
		System.out.println(a);//1
		
		double b;
		b= 3/2+1/2+2/4;//1+0+0=>1.0 3,2,4다 정수 
		System.out.println(b);//1.0
		
		b= (double)(3/2+1/2+2/4);
		System.out.println(b);//1.0
		
		b= 3/2.+1/2+2/4;//int 연산자 double => double 이면 둘다 double 처리
		System.out.println(b);//1.5
		
		
	}

}
