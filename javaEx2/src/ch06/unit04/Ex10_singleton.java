package ch06.unit04;

public class Ex10_singleton {
	public static void main(String[] args) {
		Test10 t1 = new Test10();
		Test10 t2 = new Test10();
		
		t1.print();
		t2.print();
		
		System.out.println(t1==t2);//false. 다른 객체 생성자를 두번부름
		
		//Demo10 d1 = new Demo10();// 컴파일 에러. 생성자가 private 이기 때문에
		
		Demo10 d1 = Demo10.getInstance();
		Demo10 d2 = Demo10.getInstance();
		
		System.out.println(d1==d2);//true. 같은 객체 생성자를 한번부름
	}
}

class Test10{
	private int a=10;
	public void print() {
		System.out.println(a);
	}
}

//singleton 패턴 : 하나의 객체만 생성되는 패턴
class Demo10{
	private static Demo10 obj = null;
	private int a= 5;
	
	//생성자가 private 이면 외부에서 객체 생성이 불가능
	private Demo10() {
	}
	
	public void disp() {
		System.out.println("a:"+a);
	}
	
	public static Demo10 getInstance() {
		if(obj==null) {
			obj = new Demo10();
		}
		return obj;
	}
}