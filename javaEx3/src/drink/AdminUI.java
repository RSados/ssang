package drink;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdminUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Drink drink = null;
	
	private String DrinkId = "drink";
	private String Drinkwd = "drink";
	
	public AdminUI(Drink drink) {
		this.drink = drink;
	}
	
	public void login() {
		
		menu();
	}
	
	protected void menu() {
		int s;
		
		while(true) {
			try {
				do {
					System.out.println("-----------------------------------------------");
					System.out.println("1.재고출력 2.가격&품목 변경 3.수익확인 4.물품추가 5.종료");
					System.out.println("-----------------------------------------------");
					System.out.print("선택 => ");
					s = Integer.parseInt(br.readLine());
				} while(s < 1 || s > 5);
				
				if(s == 5) {
					return;
				}
				
				switch(s) {
				case 1:stockManage(); break;
				case 2:stockChange(); break;
				case 3:profitCheck(); break;
				case 4:addStock(); break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}

	private void stockManage() {
		System.out.println("\n[재고출력]");
		
	}

	private void stockChange() {
		System.out.println("\n[가격&품목 변경]");
		
	}

	private void profitCheck() {
		System.out.println("\n[수익확인]");
		
	}

	private void addStock() {
		System.out.println("\n[물품추가]");
		
	}
}