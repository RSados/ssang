package ch06.unit03;

//Stack 메모리: 지역 변수, 매개변수
//Stack : LIFO
public class Ex10_recursion {
	
	public static void main(String[] args) {
		//재귀 호출
		Test10 obj = new Test10();
		
		obj.disp(10);
		
		System.out.println();
	}
}

class Test10{
	public void disp(int n) {
		if(n>1) {
			disp(n-1);// 재귀호출:자기 자신을 호출
		}
		
		System.out.printf("%4d",n);
	}
}