package ch08.unit02;

public class Ex04 {
	public static void main(String[] args) {
		Demo4 obj1 = new Demo4("홍길동",20);
		Demo4 obj2 = new Demo4("홍길동",20);
		
		System.out.println(obj1 == obj2);
		    //주소를 비교(false)
		
		//Object 클래스의 equals() : 객체의 주소 비교
		
		//equals() 메소드를 재정의해서 주소를 비교하지 않고 값을 비교 : true
		System.out.println(obj1.equals(obj2));
		
	}
}

class Demo4{
	private String name;
	private int age;
	
	public Demo4() {
	}
	public Demo4(String name, int age) {
		this.name = name;
		this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Object 클래스의 equals() 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		Demo4 dd = (Demo4)obj; //다운 캐스팅
		
		return dd.getName().equals(name) && dd.getAge()==age;
	}
}