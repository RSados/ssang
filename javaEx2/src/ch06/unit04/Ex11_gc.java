package ch06.unit04;

public class Ex11_gc {
	public static void main(String[] args) {
		Demo11 obj= new Demo11();
		//Demo11 객체가 생성될 때 t1 객체가 생성
		//obj가 메모리 회수가 될 때 t1도 메모리 해제
		
		obj.t1=null;// 매모리 회수의 대상
		
		obj.sub();
		//t2는 sub() 메소드를 호출할 때 객체가 생성
		//sub() 메소드가 빠져 나올 때 메모리 회수
	}

}

class Test11 {
	int a = 10;
	
	public void disp() {
		System.out.println(a);
	}
}

class Demo11 {
	Test11 t1 = new Test11();
	
	public void sub() {
		Test11 t2 = new Test11();
		t2.disp();
		
	}
	
}