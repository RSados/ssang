package ch06.unit04;

public class Ex07 {
	public static void main(String[] args) {
		Test7 t = new Test7("너자바");
		t.disp();
	}

}

//this([인수]):다른 생성자 호출
class Test7{
	private String name;
	private int age;
	
	public Test7() {
		System.out.println("인자 없는 생성자...");
	}
	
	public Test7(String name) {
		//this.name = name;
		//Test7(name,0);컴오류 생성자는 객체를 생성할때 new 다음에만 올수 있음 예외 1가지 제외하곤 생성자는 호출 불가
		this(name,0);//다른 생성자 호출(다른 생성자 몸체 실행). 생성자 선두에 단 한번만 가능//호출이기에 "인자 두개인 생성자"이것도 출력됨
		System.out.println("인자 하나인 생성자...");
	}
	
	public Test7(String name, int age) {
		this.name = name;
		this.age=age;
		
		System.out.println("인자 두개인 생성자...");
	}
	
	public void disp() {
		System.out.println(name+","+age);
	}
}
