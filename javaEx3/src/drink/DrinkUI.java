package drink;

import java.util.Scanner;

public class DrinkUI {
	private Scanner sc=new Scanner(System.in);
	
	private Drink drink = new DrinkImpl();
	private AdminUI adminUI = new AdminUI(drink);
	private UserUI userUI = new UserUI(drink);
	
	public void menu() {
		int s;
		while(true) {
			do {
				System.out.println("----------------------");
				System.out.println("1.사용자  2.관리자  3.종료 ");
				System.out.println("----------------------");
				System.out.print("선택=> ");
				s=sc.nextInt();
			} while(s < 1 || s > 3);
			
			if(s == 3) {
				return;
			}
			
			switch(s) {
			// case 1:AdminUI.login(); break;
			case 1:adminUI.menu(); break;
			case 2:userUI.menu(); break;
			}
		}
	}
	
}
