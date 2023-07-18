package ch02.unit04;

public class Ex06_DataType {
    
	public static void main(String[] args) {
		float a;
		
		a= 10;//int 리터널을 float에 대입
		//float>int
		System.out.println(a);//10.0
		
		//a=0.0;//컴파일 에러. 0.0은 double형
		//double>float
		//double 리터널은 float 변수에 대입 할 수 없음
		
		a=0.0f;//단정도형
		System.out.println(a);
		
		a=1.2e04f;//1.2*10의 4승
		System.out.println(a);
		
		//char <int<long<float<double
		a='A';
		System.out.println(a);//65.0
		
		double b;
		b=0.5;
		System.out.println(b);
		
		b=3.14D;
		System.out.println(b);
		
		//a=b;//컴파일 에러 더블이 플로트보다 큰놈이라
		a=(float)b;
		System.out.println(a);
		
	}
}
