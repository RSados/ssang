package ch05.unit01;

public class Ex09_array {
	public static void main(String[] args) {
		//1차원 배열의 초기화
		//:초기화 하는 경우 초기값의 개수가 배열의 크기
		//:초기화 할 경우 new int[5] 처럼 요소의 크기는 지정 불가
		//:초기화 하지 않는 경유 new int[5]일때 0으로 초기화
		
		//int[] num = new int[5]; //5개의 요소가 모두 0으로 초기화
		
		int[]num = new int[] {2,4,6,8,10};//선언과 동시에 초기화
		//int[]num = new int[5] {2,4,6,8,10};//컴파일 오류
		//int[] num = {2,4,6,8,10};//가능
		//선언과 동시에 초기화 할 경우 new int[]생략가능
		
		//선언과 초기화를 동시에 하지 않은 경우
		int []num2;
		num2 = new int[] {1,3,5,7,9};
		//num2 = {1,3,5,7,9};//컴파일 오류. new int[]생략불가
		
		System.out.println("배열 요소의 개수 : "+num.length);
		int s=0;
		for(int i=0;i<num.length;i++) {
			s+=num[i];
		}
		System.out.println("합 1 : "+s);
		
		s=0;
		for(int n:num2) {
			s+=n;
		}
		System.out.println("합 2: "+s);
	}
}
