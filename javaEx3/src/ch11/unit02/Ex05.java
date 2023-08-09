package ch11.unit02;

public class Ex05 {
	public static void main(String[] args) {
		Test5<Integer> tt =new Test5<>();
		
		tt.append(10);
		tt.append(20);
		tt.append(30);
		
		//Integer[] i = tt.get();//런타임 오류
		
		//제네릭 배열은 casting이 필요함
		Object[]oo = tt.get();
		for(Object o : oo) {
			Integer i = (Integer)o;
			System.out.println(i);
		}
		
	}

}

class Test5<E>{
	private E[] data;
	private int count;
	
	@SuppressWarnings("unchecked")//경고 무시
	public Test5() {
		//data = new E[10];//컴파일 에러. 제너릭으로 배열 정의 불가능
		
		//제너릭 배열의 메모리 할당 : 경고
		data = (E[])new Object[10];
	}
	
	public void append(E e) {
		if(count >= data.length) {
			throw new ArrayIndexOutOfBoundsException("요소의 개수를 초과 했습니다.");
		}
		data	[count++] = e;
	}
	
	public E[] get() {
		return data;
	}
	
	public int getCount() {
		return count;
	}
	
	
	
	
	
	
	
}






