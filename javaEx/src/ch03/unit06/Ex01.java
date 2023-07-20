package ch03.unit06;

public class Ex01 {
	public static void main(String[] args) {
		byte a;
		short b;
		char c;
		int d;
		long e;
		
		b=10;
		//a=b;//컴파일 에러 short>byte이기 때문에
		a=(byte)b;//강제 형 변환
		System.out.println(a);
		
		b=200;
		a=(byte)b;
		System.out.println(a);//-56 오버플로우 잘림현상 발생
		
		c='A';
		d=c+10;//c=>자동으로 int로 형 변환이 된다.
		System.out.println(d);//75
		
		d=1000000;
		e=d*d; // int *int =>int : 오버플로우 => long
		System.out.println(e);//-727379968
		
		e=(long)d*d;
		System.out.println(e);//1000000000000
		
		char c1,c2;
		c1='A';
		//c2=c1+10;//컴파일 에러 int로 형변환이 일어나기 때문에
		c2=(char)(c1+10);
		System.out.println(c2);
		
		c2=65;
		System.out.println(c2);
		
		c2='A'+10;//리터널은 형 변환이 일어나지 않음
		System.out.println(c2);
		
		
		
		
		
		
		
		
		
		
	}

}
