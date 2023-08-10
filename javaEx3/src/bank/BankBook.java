package bank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// 계좌 관리 클래스
public class BankBook {
	private  List<Account> accountList = new ArrayList<>();

	// 계좌 번호 만들기
	protected String generateAccountNo() {
		String s = "020-08-0000000";
		
		if(accountList.size() > 0) {
	    	Account account = accountList.get(accountList.size() - 1);
	    	s = account.getAccountNo();
	    }

		String s1 = s.substring(0, s.lastIndexOf("-"));
		String s2 = s.substring(s.lastIndexOf("-") + 1);

		int n = Integer.parseInt(s2) + 1;

		s = s1 + "-" + String.format("%07d", n);

		return s;
	}

	// 계좌 등록
	public Account addAccount(String owner, String pwd) {
		Calendar cal = Calendar.getInstance();
		
		String accountNo = generateAccountNo();
		String launch_date = String.format("%1$tF %1$tT", cal);
		
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setOwner(owner);
		account.setPwd(pwd);
		account.setLaunch_date(launch_date);
		
		accountList.add(account);
    	
    	return account;
	}

	// 계좌-전체 리스트
	public List<Account> getAccountList() {
		// 계좌-전체리스트
		return accountList;
	}
}
