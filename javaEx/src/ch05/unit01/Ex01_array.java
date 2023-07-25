package ch05.unit01;

public class Ex01_array {
	public static void main(String[] args) {
		//5개의 정수를 저장하는 변수를 선언
		//int a1,a2,a3,a4,a5;
		
		//정수를 저장할 배열 선언
		int [] num;
		//int num[];//가능
		
		//정수를 저장할 배열의 메모리 할당
		num = new int[5];
		
		//배열을 사용(첨자는 0부터 배열크기-1 까지 사용 가능)
		//첨자는 배열의 위치
		num[0]=10;num[1]=20;num[2]=30;num[3]=40;num[4]=50;
		//num[5]=60;//런타임에러 ArrayIndexOutOfBoundsException
		
		int s=0;
		for(int i=0;i<5;i++) {
			s+=num[i];
		}
		System.out.println("결과: "+s);
		
		
	}

}
