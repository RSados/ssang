package ch12.unit07;

import java.util.Set;
import java.util.TreeSet;

public class Ex08_TreeSet {
	public static void main(String[] args) {
		//TreeSet : Comparable 인터페이스 구현 클래스만 가능
		Set<TestVO> set = new TreeSet<TestVO>();
		
		set.add(new TestVO("다자바",20));
		set.add(new TestVO("가자바",25));
		set.add(new TestVO("나자바",23));
		
		for(TestVO vo : set) {
			System.out.println(vo.getName()+ ":" + vo.getAge());
		}
		System.out.println();
		
	}

}

class TestVO implements Comparable<TestVO>{
	private String name;
	private int age;
	
	public TestVO() {
		
	}
	
	public TestVO(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public int compareTo(TestVO o) {
		return age - o.getAge();
	}
	
	
}