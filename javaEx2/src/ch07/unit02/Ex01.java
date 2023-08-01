package ch07.unit02;

public class Ex01 {
	public static void main(String[] args) {
		// Test01의 상위 클래스 : Object
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = t1;
		
		//Object 의 toStrin() : 클래스명@해시코드
		System.out.println(t1.toString());
		System.out.println(t1);//위와 동일한 결과
		System.out.println();
		
		//객체의 주소 비교
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		System.out.println();
		
		//해쉬코드 : JVM이 객체를 빠르게 검색하기 위해 사용
		//같은 객체는 해쉬코드가 같지만 해쉬코드가 같다고 같은 객체는 아님
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
	}
}

class Test01 {
	int a= 10;
	int b=10;
	
	public void println() {
		System.out.println(a+","+b);
	}
}