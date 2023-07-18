package ch02.unit03;
/*
 - System out: 표준 출력 스트림. 바로 사용 가능
 - System.out.print(인수)
 :인수의 내용을 출력 장치를 통해 출력
 :출력후 라인을 넘기지 않는다.
 :인수는 생략할 수 없다.
 */
public class Ex01_print {

	public static void main(String[] args) {
		//System.out.print();//컴파일 오류. 출력할 인수가 없음
		
		System.out.print("HTML 5, ");
		System.out.print("Javascript, ");
		System.out.print("CSS 3");
		System.out.print("\n");//\n:라인을 넘김. 코드:10
		
		System.out.print("JAVA\nJSP");
		System.out.print("\nSpring");
		System.out.print("\nORACLE\n\n");
		
		System.out.print("국어	");
		System.out.print("영어\t");
		System.out.print("수학\n");
		
		System.out.print(90 + "\t");
		System.out.print(80 + "	");
		System.out.print(100 + "\n");
	}

}
