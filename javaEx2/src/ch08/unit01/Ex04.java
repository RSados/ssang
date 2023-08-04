package ch08.unit01;

public class Ex04 {
	public static void main(String[] args) {
		//Test4 t = new Test4(); // 컴파일 오류. 인자가 없는 생성자가 없음
		Test4 t = new Test4(100);
		t.print();
		System.out.println();
		
		Demo4 d = new Demo4();
		d.disp();
	}

}

/*
 - 상위 클래스에 인자가 있는 생성자만 있는 경우
   하위 클래스는 반드시 생성자를 만들어야 하고 명시적으로 생성자를 호출해야 함
 */
class Test4{
	int x;
	
	public Test4(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Demo4 extends Test4{
	int a =10;
	
	public Demo4() {
		// super(); // 컴파일 오류. 상위 클래스에 인자가 없는 생성자가 없음
		super(5);// 상위 클래스의 인자가 하나인 생성자 호출
	}
	
	public void disp() {
		System.out.println(x+","+a);
	}
	
}


