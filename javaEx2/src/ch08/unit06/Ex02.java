package ch08.unit06;

public class Ex02 {
	public static void main(String[] args) {
		DemoImpl2 dd = new DemoImpl2();
		dd.disp();
		dd.print();
		dd.sub();
		System.out.println();
		
		Ademo2 dd2 = new DemoImpl2();//up-casting
		dd2.disp();
		//dd2.print();//print()메소드는 Bdemo2 인터페이스에 선언되어 있음
		
		((DemoImpl2)dd2).print();//down-casting
		((Bdemo2)dd2).print();//가능.
		    //DemoImpl2 클래스가 Ademo2, Bdemo2 인터페이스를 모두 구현했으므로
		
	}
}

interface Ademo2 {
	public void disp();
}

interface Bdemo2 {
	public void print();
}

//클래스는 2개 이상의 인터페이스를 구현할 수 있다.
class DemoImpl2 implements Ademo2, Bdemo2{

	@Override
	public void print() {
		System.out.println("print...");
		
	}

	@Override
	public void disp() {
		System.out.println("disp...");
		
	}
	
	public void sub() {
		System.out.println("sub...");
	}
	
}