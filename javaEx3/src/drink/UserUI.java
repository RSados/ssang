package drink;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Drink drink = null;
	
	public UserUI(Drink drink) {
		this.drink = drink;
		
	}
	
	public void menu() {
		int s;
		while(true) {
			try {
				do {
					System.out.println("-----------------------------------");
					System.out.println("1.잔액반환 2.계속뽑기 3.추가투입 4.종료하기");
					System.out.println("-----------------------------------");
					System.out.print("선택 => ");
					s = Integer.parseInt(br.readLine());
				} while(s < 1 || s > 4);
				
				if(s == 4) {
					return;
				}
				
				switch(s) {
				case 1:balanceReturn(); break;
				case 2:tryAgain(); break;
				case 3:addInput(); break;
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void balanceReturn() {
		System.out.println("\n[잔액반환]");
		
	}

	private void tryAgain() {
		System.out.println("\n[계속뽑기]");
		
	}

	private void addInput() {
		System.out.println("\n[추가투입]");
		
	}
}



