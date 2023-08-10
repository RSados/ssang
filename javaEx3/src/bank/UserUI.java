package bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 고객 화면 UI
public class UserUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Bank bank = null;
	
	public UserUI(Bank bank) {
		this.bank = bank;
	}
	
	public void menu() {
		int ch;
		while(true) {
			try {
				do {
					System.out.println("-----------------------------------------------------");
					System.out.println("1.계좌개설 2.입금 3.출금 4.계좌이체 5.잔액조회 6.거래내역 7.종료");
					System.out.println("-----------------------------------------------------");
					System.out.print("선택=> ");
					ch = Integer.parseInt(br.readLine());
				} while(ch < 1 || ch > 7);
				
				if(ch == 7) {
					return;
				}
				
				switch(ch) {
				case 1:addAccount(); break;
				case 2:deposit(); break;
				case 3:withdraw(); break;
				case 4:accountTransfer(); break;
				case 5:balance(); break;
				case 6:transactionHistory(); break;
				}
			} catch (Exception e) {
			}
			
		}
	}

	public void addAccount() {
		System.out.println("\n[개인-계좌 개설]");

	}
	
	public void deposit() {
		System.out.println("\n[개인-입금]");

	}

	public void withdraw() {
		System.out.println("\n[개인-출금]");
		
	}

	public void accountTransfer() {
		System.out.println("\n[개인-계좌이체]");

	}

	public void balance() {
		System.out.println("\n[개인-잔액조회]");

	}

	public void transactionHistory() {
		System.out.println("\n[개인-거래내역조회]");

	}
}
