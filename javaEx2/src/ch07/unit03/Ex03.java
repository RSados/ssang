package ch07.unit03;

public class Ex03 {
	public static void main(String[] args) {
		long a;
		a=10;
		
		Long b;
		//b= 100;//컴오류. 100을 Integer로 인식해서 Long에 못넣음
		b=100L;
		
		int x;
		x=(int)a;//long을 int로 캐스팅
		
		//Integer y = (Integer)b;//컴파일 오류. 클래스는 상하관계만 캐스팅 가능
		  //Integer과 Long은 상속 관계가 아님
		
		System.out.println(a+","+b+","+x);
	}

}
