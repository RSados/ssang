package ch07.unit04;

public class Quiz04_AccountNo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		String s;
		
		s= bank.generateAccountNo();
		System.out.println(s);//020-08-0000171
		
		s= bank.generateAccountNo();
		System.out.println(s);//020-08-0000172
		
		s= bank.generateAccountNo();
		System.out.println(s);//020-08-0000173
		
		
	}

}

class Bank{
	//마지막 7자리 다음의 문자열 만들기
	private String accountNo = "020-08-0000170";
	
	public String generateAccountNo() {
		String s1,s2;
		int t;
		s1 = accountNo.substring(7);
		s2 = accountNo.substring(0,7);
		t = Integer.parseInt(s1);
		t+=1;
		accountNo= s2+String.format("%07d", t);
		
		
		return accountNo;
	}
}