package ch08.unit02;

public class Ex02 {
	public static void main(String[] args) {
		Demo2 dd = new Demo2();
		
		dd.setName("김자바");
		dd.setAge(20);
		
		System.out.println(dd.getName()+","+dd.getAge());
		
		//Object toString() : 클래스명@해쉬코드
	    System.out.println(dd.toString());
	    System.out.println(dd);
		
	}
}

class Demo2{
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
	
	
}