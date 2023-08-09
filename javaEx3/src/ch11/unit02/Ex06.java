package ch11.unit02;

public class Ex06 {
	public static void main(String[] args) {
		Test6<Integer> t = new TestImp16<>();
		t.print(10);
	}

}

//제네릭 인터페이스
interface Test6<T>{
	public void print (T t);
}

//구현 클래스-1
class TestImp16<T> implements Test6<T>{

	@Override
	public void print(T t) {
		System.out.println(t);
	}
}

//구현 클래스-2
class DemoImp16 implements Test6<String>{

	@Override
	public void print(String t) {
		// TODO Auto-generated method stub
		
	}
	
}












