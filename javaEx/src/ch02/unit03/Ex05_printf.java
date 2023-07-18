package ch02.unit03;

public class Ex05_printf {

	public static void main(String[] args) {
		//%f :실수(float,double) 출력
		//   :기본적으로 소수점 이하는 6자리 출력
		System.out.printf("%f\n",123.23); //123.230000
		
		System.out.printf("%8.2f\n",123.236);//123.24
		System.out.printf("%8.2f\n",123.234);//123.23
		//전체 8자리, 소수점 이하는 2자리. 소수점도 자릿수 포함
		//소수점 자리수 뒤에 있는 수는 반올림
		//정수 앞에 2칸의 공백
		System.out.printf("%.2f\n",123.236);//123.24
		System.out.printf("%4.2f\n",123.236);//123.24
		//정수는 자릿수가 부족하면 무시하고 다 출력
		
		System.out.printf("%5.0f\n",15.7);//16
		System.out.printf("%5.0f\n",15.4);//15
		System.out.println();
		
		//%e : n.nnnnne+nn=>1.234500e+01
		System.out.printf("%e\n",123.456);//1.234560e+02(10의 제곱)==123.456
		System.out.printf("%e\n",12345.0e-03);//12345.0*-10*3제곱 == 1.234500e+01
		System.out.printf("%10.3e\n",123.456);//1.235e+02
		System.out.println();
		
		//0~9: 10진수
		//0,1: 2진수
		//0~9,A~F: 16진수
		//0~7: 8진수
		
		System.out.printf("%X\n", 27);//1B
		System.out.printf("%x\n", 27);//1b
		//%x, %X: 16진수로 출력
		System.out.printf("%o\n", 27);//33
		//10진수 27을 8진수로 출력
		System.out.printf("%d\n", 0x1b);//0x를 앞에 붙히면 16진수라고 알려줌
		//27: 10진수
		//0x1b: 16진수
		System.out.printf("%d\n", 0x27);//39
		
		System.out.printf("%d\n", 033);//27
		//033: 8진수 => 10진수 27
		
		System.out.printf("%x\n", 39);
		//10진수 39를 16진수로 출력하면 27이 나옴
		System.out.printf("%#x\n", 39);//0x27
		//#은 16진수 나타내는 0x를 숫자앞에 출력한다.
		System.out.println();	
	}

}
