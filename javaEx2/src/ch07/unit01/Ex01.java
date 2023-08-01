package ch07.unit01;

// <ctrl> + <shift> + o : import 정리
import ch07.join.Member;

import static java.lang.Math.*;

public class Ex01 {
	public static void main(String[] args) {
		User obj = new User();//동일한 패키지의 클래스는 바로 사용 가능
		obj.setName("홍길동");
		obj.setAge(10);
		System.out.println(obj.getName()+","+obj.getAge());
		
		//다른 패키지의 클래스를 패키지명을 명시하여 호출
		//ch07.join.Member n = new ch07.join.Member();
		
		//다른 패키지의 클래스를 패키지명 import 후 호출
		Member m = new Member();
		m.setId("abc");
		m.setName("다자바");
		System.out.println(m.getId()+","+m.getName());
		
		//static import를 했으므로 Math.random() 대신 random()으로 호출
		System.out.println(random());
		
	}

}
