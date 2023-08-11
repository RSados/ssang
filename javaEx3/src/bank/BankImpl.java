package bank;

import java.util.List;

public class BankImpl implements Bank {
	private BankBook bankBook = new BankBook(); // 계좌 관리 클래스
	private BankBookSearch bankBookSearch = null; // 계좌 검색 클래스
	private BankMoney bankMoney = null; // 계좌 입출금 클래스

	public BankImpl() {
		bankBookSearch = new BankBookSearch(bankBook);
		bankMoney = new BankMoney(bankBookSearch);
	}

	@Override
	public Account addAccount(String owner, String pwd) {
		// 계좌 등록
		Account account = bankBook.addAccount(owner, pwd);
		return account;
	}

	@Override
	public long deposit(String accountNo, long amount) throws AccountNotFoudException {
		// 입금
		long balance = 0L;
		
		try {
			balance = bankMoney.deposit(accountNo, amount);
		} catch (AccountNotFoudException e) {
			throw e;
		}
		
		return balance;
	}

	@Override
	public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException {
		// 출금
		long balance = 0L;
		
		try {
			balance = bankMoney.withdraw(accountNo, pwd, amount);
		} catch (AccountNotFoudException e) {
			throw e;
		} catch (BalanceException e) {
			throw e;
		}
		return balance;
	}

	@Override
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException{
		// 계좌이체
		long fromBalance = 0L;
		
		try {
			fromBalance = bankMoney.accountTransfer(fromAccountNo, fromPwd, toAccountNo, amount);
		} catch (AccountNotFoudException e) {
			throw e;
		} catch (BalanceException e) {
			throw e;
		}

		// 출금한 계좌의 잔액
		return fromBalance;
	}

	@Override
	public long balance(String accountNo) throws AccountNotFoudException{
		// 잔액조회
		long balance = 0L;
		try {
			balance = bankMoney.balance(accountNo);
		} catch (AccountNotFoudException e) {
			throw e;
		}
		return balance;
	}

	@Override
	public long balance(String accountNo, String pwd) throws AccountNotFoudException{
		// 잔액조회
		long balance = 0L;
		try {
			balance = bankMoney.balance(accountNo, pwd);
		} catch (Exception e) {
			throw e;
		}
		return balance;
	}
	
	@Override
	public List<TransactionVO> transactionHistory(String accountNo, String pwd) throws AccountNotFoudException{
		// 거래 내역
		Account account = readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
		return bankBookSearch.transactionHistory(accountNo);
	}
	
	@Override
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException{
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
		return bankBookSearch.transactionHistory(accountNo);
	}
	
	@Override
	public Account readAccount(String accountNo) {
		// 계좌-번호검색
		return bankBookSearch.readAccount(accountNo);
	}
	
	@Override
	public Account readAccount(String accountNo, String pwd) {
		return bankBookSearch.readAccount(accountNo);
	}
	
	@Override
	public List<Account> getAccountList(String owner) {
		// 계좌-이름검색
		return bankBookSearch.getAccountList(owner);
	}

	@Override
	public List<Account> getAccountList() {
		// 계좌-전체 리스트
		return bankBook.getAccountList();
	}
}
