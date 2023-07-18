package ch02.unit04;

public class Ex01 {

	public static void main(String[] args) {
		int a, b, c;//정수형 변수 선언
		//c= a+b;//변수를 초기화 하지 않으면 연산할 수 없음
		//System.out.println(a);//컴파일 오류. 초기화 되어 있지 않으면 출력 불가
		b=10;
		c=5;
		a=b+c;
		System.out.println(a);
		
		//int a = 30;//컴파일 오류. 블럭 안에서 동일한 이름의 변수 선언 불가
		
		a=30;//위에서 a가 가지고 있던 15는 사라짐
		System.out.println(a);
		
		//a=15.0;//컴파일 오류.실수를 정수형에 대입 불가

	}

}
