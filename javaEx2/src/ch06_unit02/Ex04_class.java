package ch06_unit02;

public class Ex04_class {
	public static void main(String[] args) {
		//레퍼런스 변수(메모리를 할당 받은)만큼 필드는 메모리 할당을 받는다.
		Test4 t1 = new Test4();
		//t1의 a,b 필드가 메모리 할당
		Test4 t2 = new Test4();
		//t2의 a,b 필드가 메모리 할당
		
		t1.b=50;
		System.out.println(t1.a+":"+t1.b);//10,50
		System.out.println(t2.a+":"+t2.b);//10,0
		
		System.out.println(t1==t2);//false. 주소비교
		//서로 다른 객체.다른곳을 참조하고 있음
		
		Test4 t3 = new Test4();
		//t3의 a,b 필드가 메모리 할당
		Test4 t4 = t3;
		//t4는 t3와 동일한 곳을 참조한다
		t4.b=100;
		System.out.println(t3.a+":"+t3.b);//10,100
		System.out.println(t4.a+":"+t4.b);//10,100
		
		System.out.println(t3==t4);//true. 주소비교 동일한 주소
		//동일한 곳을 참조
		
		//클래스명@해쉬코드
		//해쉬코드:JVM에서 객체를 빠르게 검색하기 위해 사용
		//동일한 객체는 해쉬코드가 같지만, 해쉬코드가 같다고 동일한 객체는 아님
	    System.out.println(t1);//ch06_unit02.Test4@7c30a502
	    System.out.println(t2);//ch06_unit02.Test4@49e4cb85
	    System.out.println(t3);//ch06_unit02.Test4@2133c8f8
	    System.out.println(t4);//ch06_unit02.Test4@2133c8f8
	    
		
	}

}

class Test4{
	int a=10;
	int b;
	
	public void disp() {
		System.out.println(a+","+b);
	}
}