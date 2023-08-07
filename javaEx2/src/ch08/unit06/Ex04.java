package ch08.unit06;

public class Ex04 {
	public static void main(String[] args) {
		Cdemo4 dd =new DemoImpl4();
		dd.sub();
	}

}

interface Ademo4{
	public void print();
}

interface Bdemo4{
	public void disp();
}

//인터페이스는 다른 인터페이스를 상속 받을 수 있다.
//인터페이스는 2개 이상의 인터페이스 상속 가능. 자바는 한개만 상속 가능
interface Cdemo4 extends Ademo4, Bdemo4{
	public void sub();
}

class DemoImpl4 implements Cdemo4{

	@Override
	public void print() {
		System.out.println("print...");
		
	}

	@Override
	public void disp() {
		System.out.println("disp...");
		
	}

	@Override
	public void sub() {
		System.out.println("sub...");
		
	}
	
}