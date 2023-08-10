package bank;

// 입출금 관리 클래스
public class BankMoney {
	private BankBookSearch bankBookSearch = null;

	public BankMoney(BankBookSearch bankBookSearch) {
		this.bankBookSearch = bankBookSearch;
	}

	// 입금
	public long deposit(String accountNo, long amount) throws AccountNotFoudException {

    	return 0L;
    }

	// 출금
    public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException{
    	
    	return 0L;
    }
    
	// 계좌이체
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException {
		
    	return 0L;
	}

	// 잔액조회
	public long balance(String accountNo, String pwd) throws AccountNotFoudException {
		
    	return 0L;
	}

	// 잔액조회
	public long balance(String accountNo) throws AccountNotFoudException {
		
    	return 0L;
	}

}
