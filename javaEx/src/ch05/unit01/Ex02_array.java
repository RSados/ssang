package ch05.unit01;

public class Ex02_array {
	public static void main(String[] args) {
		//배열 선언과 메모리 할당을 한번에 하기
		int [] score = new int[5];
		
		//배열 요소에 값을 저장
		score[0]=80; score[1]=90; score[2]=85; score[3]=90; score[4]=95;
		
		//합 계산하기
		int tot=0;
		/*
		for(int i=0;i<5;i++) {
			tot+=score[i];
		}*/
		for(int n : score) {//향상된 for문
			tot+=n;
			System.out.println(n);
	
		}
		System.out.println("결과: "+tot);
	}
	

}
