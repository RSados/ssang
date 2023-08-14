package drink;

public class MoneyVO {

	private int money;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money<0) {
			System.out.println("금액은 양수입니다.");
			return;
		}
		this.money += money;
	}
	
	public void remainMoney(int drinkPrice) {
		
		this.money-=drinkPrice;
	}
	public void change() {
		if(this.money<=0) {
			System.out.println("잔액이 없습니다.");
		}
		System.out.println(this.money+"원을 반환합니다.");
		this.money=0;
	}
	
	
	
}