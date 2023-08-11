package bank;

import java.util.ArrayList;
import java.util.List;

// 계좌 검색 클래스
public class BankBookSearch {
	private BankBook bankBook; // 계좌 정보

	public BankBookSearch(BankBook bankBook) {
		this.bankBook = bankBook;
	}

	// 잔액조회
	public long balance(String accountNo) throws AccountNotFoudException {
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
    	
		TransactionVO vo = account.lastTransaction();
		long balance = 0L;
		if(vo != null) {
			balance = vo.getBalance();
		}
		
    	return balance;
	}

	// 거래내역조회
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException{
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
    	return account.transactionList();
	}
	
	// 계좌-번호검색
	public Account readAccount(String accountNo) {
		List<Account> accountList = bankBook.getAccountList();
		
    	for(Account account : accountList) {
			if(account.getAccountNo().equals(accountNo)) {
				return account;
			}
		}
    	
    	return null;
	}

	// 계좌-번호검색
	public Account readAccount(String accountNo, String pwd) {
		List<Account> accountList = bankBook.getAccountList();

		for(Account account : accountList) {
			if(account.getAccountNo().equals(accountNo) && account.getPwd().equals(pwd)) {
				return account;
			}
		}
    	
    	return null;
	}
	
	// 계좌-이름검색
	public List<Account> getAccountList(String owner) {
		List<Account> accountList = bankBook.getAccountList();
		
		List<Account> findAccount = new ArrayList<>();
		
		for(Account account : accountList) {
			if(account.getOwner().equals(owner)) {
				findAccount.add(account);
			}
		}
    	
    	return findAccount;
	}

}
