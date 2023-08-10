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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deposit(String accountNo, long amount) throws AccountNotFoudException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount)
			throws AccountNotFoudException, BalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long balance(String accountNo) throws AccountNotFoudException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long balance(String accountNo, String pwd) throws AccountNotFoudException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionVO> transactionHistory(String accountNo, String pwd) throws AccountNotFoudException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account readAccount(String accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account readAccount(String accountNo, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccountList(String owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
