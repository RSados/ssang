package ch11.unit02;

/*
 -generic
  : 다양한 타입의 객체를 다루는 클래스나 인터페이스에서 사용할 데이터 타입을 인스턴스를 생성할 때 결정
  : 데이터 타입에 대한 별도의 메소드나 변수를 작성할 필요 없이 미리 정의된 메소드나 변수들에 대하여 서로 다른 자료형으로 처리할 수 있다.
  : 객체의 타입을 컴파일할때 체크하므로 객체 타입의 안정성을 높이고 불필요한 형 변환을 줄일수 있다.
 */
public class Ex03_generic {
	public static void main(String[] args) {
		Test3<String> t = new Test3<>();
		t.set("서울");
		//t.set(100);//컴파일 에러 
		String s = t.get();
		System.out.println(s+","+s.length());
		
		Test3<Integer>t2 = new Test3<>();
		//t2.set("100");//컴에러
		t2.set(100);
		int a = t2.get();
		System.out.println(a);
		
		//Test3 ob = new Test3();//T : Object로 처리, 경고 ,사용하지 않는 것이 좋다
		//ob.set("서울");
		//String s2 = (String)ob.get();
	}

}

//generic : 하나의 "타입" 파라미터
class Test3<T>{// T는 가변 객체가 생성되는 시점에 데이터 타입을 결정 캐스팅안하고 바로 원하는 데이터 타입으로 반환받을수 있다.
	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
}