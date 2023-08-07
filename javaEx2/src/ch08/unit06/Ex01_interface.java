package ch08.unit06;

public class Ex01_interface {
	public static void main(String[] args) {
		//Demo1 dd = new Demo1;//컴오류
		      // 인터페이스는 추상클래스의 일종으로 격체 생상 불가 
		
		//DemoImpl1 : Demo 인터페이스 구현 클래스
        //up-casting
		Demo1 dd = new DemoImpl1();
		dd.print();
		
		//dd.sub();//컴파일 오류.
		   //구현 클래스에는 정의되어 있지만 인터페이스에는 존재하지 않음
		
		((DemoImpl1)dd).sub();//down-casting
		
		System.out.println(Demo1.A);
		
		//Demo1.B =50; // 컴파일 오류. final 변수는 값 변경 불가
	}
}

//인터페이스 : 선언만 있고 정의가 없는 abstract 클래스의 일종 
//인터페이스 작성
interface Demo1{
	public static final int A = 10;
	int B = 20; //필드는 public static final 붙이지 않아도 public static final
	
	//인터페이스 메소드는 public abstract 만 가능
	public abstract void disp();
	void print(); // public abstract 없어도 public abstract
	
	//punlic void write(){ 	}// 컴파일 오류.메소드 정의 불가
	
}

//인터페이스 구현
class DemoImpl1 implements Demo1{

	@Override
	public void disp() {
		System.out.println("disp...");
	}

	@Override
	public void print() {
		System.out.println("print....");
		
	}
	
	public void sub(){
		System.out.println("sub...");
	}
	
	
}

