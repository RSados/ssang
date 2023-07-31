package ch06.unit03;

public class Ex01_class {
	public static void main(String[] args) {
		//레퍼러너스 변수(지역변수)
		Test1 t = new Test1();
		
		//일반 변수(지역변수)
		int result;
		
		//메소드 호출
		result = t.sub(10);
		System.out.println(result);
		
		t.sub(3);
		
		
	}
}
// 기능 : 총점을 계산한다, 평균을 계산한다, 석차를 계산한다...
class Test1{
	//메소드 : 기능을 구현
	//형식 : 접근제어 리턴타입 메소드명([매개변수타입 매개변수]){ }
	//매개변수는 지역 변수
	//지역변수는 메소드안에서만 사용가능
	//지역변수는 메소드를 호출할때 메모리 할당을 받고 메소드를 빠져 나가면 메모리 해제
	public int sub(int n) {//n:형식매개변수(가인수)-지역변수
		int s=0;//지역변수-스택메모리영역에 메모리 할당
		
		s=n+5;
		for(int i=0;i<5;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		return s;//리턴값은 리턴타입과 같거나 적어야 한다.
		//int로 돌려달라 했으니 int 가능 char등 가능(int 보다 작은거)...
	}
}