package ch06_unit03;

import java.util.Arrays;

public class Ex04_class {
	public static void main(String[] args) {
		Test4 tt = new Test4();
		int []a = new int[] {2,4,6,8,10};
		int s;
		
		s= tt.total(a);
		System.out.println(s);
		
		int n=10; //main 메소드의 변수
		tt.sub(n);//n이 가지고 있는 값 10을 넘긴다.
		//실인수(값을 보낸쪽)와 가인수는 기억공간을 따로 확보
		System.out.println(n);//10
		
		int[]x= {1,2,3,4,5};
		System.out.println(Arrays.toString(x));//1,2,3,4,5
		tt.sub2(x);//x가 가지고 있는 배열의 주소를 넘긴다.
		System.out.println(Arrays.toString(x));//[1,100,3,4,5]
	
	
	}
}

class Test4 {
	//인자로 넘어온 배열의 합 구하기
	public int total(int[] num) {
		int s = 0;
		for(int i=0; i<num.length;i++) {
			s += num[i];
		}
		return s;
	}
	
	//인자로 넘어온 일반변수의 값 변경
	public void sub(int n) {//n은 sub() 메소드의 변수
		n=100;//sub() 함수의 변수인 n의 값을 변경
		//따라서 main()의 변수 n은 변화가 없음
	}
	
	//인자로 넘어온 배열의 요소 값 변경
	public void sub2(int[] a) {
		a[1]= 100;
		//a가 가지고 있는 주소의 1번 첨자의 값을 변경
		//main에서의 a 배열의 1번 첨자의 값도 변경됨
	}
	
	
	
	
}
