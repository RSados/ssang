package ch09.unit03;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User18 uu = new User18();
		
		try {
			System.out.print("이름 ? ");
			uu.setName(sc.next());
			
			System.out.print("나이 ? ");
			uu.setAge(sc.nextInt());
			
			System.out.println(uu.getName() + "," + uu.getAge());
		} catch (NameValidException e) {
			System.out.println("이름은 두자이상...");
		} catch (AgeValidException e) {
			System.out.println("나이는 0이상...");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}

//사용자 정의 예외 클래스(checked exception)
class NameValidException extends Exception{
	private static final long serialVersionUID = 1L;

	public NameValidException(String msg) {
		super(msg);
	}
}

class AgeValidException extends Exception{
	private static final long serialVersionUID = 1L;

	public AgeValidException(String msg) {
		super(msg);
	}
}

class User18{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameValidException{
		if(name == null||name.length()<2) {
			throw new NameValidException("이름은 두글자 이상입니다.");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeValidException{
		if(age<0) {
			throw new AgeValidException("나이는 0살 이상입니다.");
		}
		this.age = age;
	}
	
	
}