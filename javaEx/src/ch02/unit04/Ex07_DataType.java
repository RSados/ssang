package ch02.unit04;

public class Ex07_DataType {
	public static void main(String[] args) {
		//정밀도
		int i1 = 2000000000;
		int i2 = 2000000050;
		
		float f1 = 2000000000;
		float f2 = 2000000050;
		
		double d1 = 2000000000;
		double d2 = 2000000050;
		
		System.out.printf("int : %d, %d\n",i1,i2);
		//2000000000, 2000000050
		System.out.printf("float : %.2f, %.2f\n",f1,f2);
		//2000000000.00, 2000000000.00 잘림 형상이 일어남 정밀한 프로그램에서는 사용 X
		System.out.printf("double : %.2f, %.2f\n",d1,d2);
		//2000000000.00, 2000000050.00 잘림 현상이 없으나 기본적인 크기(연산량)가 큼
	}

}
