package ch04.unit03.forEx;

/*
 for(초기식;조건식;증감식){
 문장;
 }
 
 조건식:true 또는 false, 조건식이 false이면 for문은 빠져 나감
 초기식 -> 조건식(참) -> 문장 -> 증감식
       -> 조건식(참) -> 문장 -> 증감식
       -> 조건식(거짓) -> for문을 빠져 나감
 */
public class Ex01_for {
	public static void main(String[] args) {
		/*
		int n;
		for(n=1;n<=10; n++) {
			System.out.print(n+" ");//1 2 ... 10
			
		}
		System.out.println("\n밖:"+n);//11*/
		//for안에서 변수 선언
		for(int n=1;n<=10;n++) {
			System.out.print(n+" ");//1 2 ...10
		}
		//System.out.println("\n밖:"+n);//컴파일 에러
		//for문 안에서 선언한 변수는 밖에서 사용불가
	}
}
