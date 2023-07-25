package ch05.unit01;

public class Ex03_array {
	public static void main(String[] args) {
		//int a;
		//System.out.println(a);//컴파일 에러 a변수는 초기화가 되어 있지 않으므로
		
		int []aa= new int[3];
		//배열은 메모리 할당 할때 기본값으로 초기화 한다.
		//숫자변수는 0, 객체는 null로 초기화
		
		System.out.println(aa[0]);//0
		
		//배열의 length 속성 : 배열 요소의 개수
		System.out.println(aa.length);//3
		
		aa[0]=10;aa[1]=20;aa[2]=30;
		
		int s=0;
		/*
		for(int x:aa) {
			s+=x;
		}*/
		for(int i=0;i<aa.length;i++) {//for(int i=0;i<3;i++)
			s+=aa[i];
			System.out.println(aa[i]);
		}
		System.out.println(s);
	}

}
