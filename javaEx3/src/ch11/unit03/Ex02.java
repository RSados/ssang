package ch11.unit03;

public class Ex02 {
	public static void main(String[] args) {
		Test2 <Integer>t1 = new Test2<>();
		t1.set(100);
		disp(t1);
		
		Test2<String> t2 = new Test2<>();
		t2.set("자바");
		disp(t2);

	}
	
	//제네릭 와일드 카드 - ?
	// : 모든 클래스나 모든 인터페이스가 가능
	// : 제네릭 타입에 의존적이지 않는 메소드등을 호출 할때 사용
	public static void disp(Test2<?> obj) {//Object는 사용불가
		System.out.println("-------------------------");
		obj.print();
		System.out.println("-------------------------");
		//obj.set(5);// 컴파일 오류. 자료형이 결정되지 않았으므로
	}
}

class Test2<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public void print() {
		System.out.println(t);
	}
}
