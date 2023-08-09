package ch11.unit02;

public class Ex04 {
	public static void main(String[] args) {
		Test4<String, Integer> obj = new Test4<>();
		
		obj.set("국어", 95);
		obj.print();
		
	}

}

//두개의 타입 파라미터
class Test4<T,U>{
	private T t;
	private U u;
	
	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	public void print() {
		System.out.println(t+", "+t.getClass().getName());
		System.out.println(u+", "+u.getClass().getName());
	}
}
