package ch06.di;

import java.util.Scanner;

//DI : Dependency Injection(의존성 주입)
public class UserUI {
	private Scanner sc = new Scanner(System.in);
	private User user = new User();
	private UserResult ur;
	
	public UserUI() {
		//생성자를 이용하여 의존성을 주입
		ur = new UserResult(user);
	}
	
	public void menu() {
		int ch;
		
		while(true) {
		do {
			System.out.print("1.등록 2.출력 3.종료 => ");
			ch = sc.nextInt();
		}while(ch<1 || ch>3);
			
		if(ch==3) {
			return;
		}
		
		switch(ch) {
		case 1 :input();break;
		case 2 :disp(); break;
		}
	}
}
	public void input() {
		System.out.println("\n데이터 등록...");
		
		UserVO vo = new UserVO();
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("나이 ? ");
		vo.setAge(sc.nextInt());
		
		int count = user.append(vo);
		
		System.out.println("데이터를 등록 했습니다. 전체인원 : "+count);
		System.out.println();
	}
	
	public void disp() {
		System.out.println("\n데이터 출력...");
		
		ur.printAll();
	}
	

}
