package ch11.unit03;

public class Ex01 {
	public static void main(String[] args) {
		Test1<Number> t1 = new Test1<>();
		Integer i1 = 10;
		
		t1.set(i1); //타입 매개변수의 상속관계는 성립
		          // Number > Integer이므로 가눙
		System.out.println(t1.get());
		
		//Number n = t1.get();
		//Integer n = t1.get();//컴파일 오류
		Integer n = (Integer)t1.get();
		System.out.println(n);
		System.out.println();
		
		Test1<Integer>t2 = new Test1<>();
		t2.set(100);
		System.out.println(t2.get());
		
		//Integer a =10;
		//Number b = a; //Number > Integer 이므로 가능. up-casting
		
		//Test1<Number> t3 = t2;//컴에러. 제너릭은 상속 관계가 아님
		
		
	}
}

class Test1<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}