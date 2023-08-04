package ch08.unit02;

public class Ex03 {
	public static void main(String[] args) {
		Demo3 dd = new Demo3();
		dd.setName("김자바");
		dd.setAge(21);
		
		//Object의 toString()를 재정의 하여 이름과 나이가 출력 됨
		System.out.println(dd.toString());
		System.out.println(dd);
	}
}

class Demo3{

	private String name;
	private int age;
	
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
	
	@Override
	public String toString() {
		return name + "\t"+age;
	}
}







