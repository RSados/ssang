package ch06.unit04;

public class Ex03 {
	public static void main(String[] args) {
		Test3 t1 = new Test3();//인자없는 생성자
		t1.disp();
		
		Test3 t2 = new Test3(200);//인자 있는 생성자
		t2.disp();
	}

}

class Test3{
	private int a;
	public Test3() {
		System.out.println("인자 없는 생성자");
	}
	
	public Test3(int x) {
		a=x;
		System.out.println("인자 있는 생성자");
	}
	
	public void disp() {
		System.out.println("a:"+a);
	}
}