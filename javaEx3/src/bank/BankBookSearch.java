package bank;

import java.util.List;

// 계좌 검색 클래스
public class BankBookSearch {
	private BankBook bankBook; // 계좌 정보

	public BankBookSearch(BankBook bankBook) {
		this.bankBook = bankBook;
	}

	// 잔액조회
	public long balance(String accountNo) throws AccountNotFoudException {
		
    	return 0L;
	}

	// 거래내역조회
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException{
		
    	return null;
	}
	
	// 계좌-번호검색
	public Account readAccount(String accountNo) {
    	
    	return null;
	}

	// 계좌-번호검색
	public Account readAccount(String accountNo, String pwd) {
    	
    	return null;
	}
	
	// 계좌-이름검색
	public List<Account> getAccountList(String owner) {
    	
    	return null;
	}

}
