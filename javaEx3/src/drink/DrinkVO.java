package drink;

public class DrinkVO {
	private int drinkprice;
	private int drinkstock;
	
	public DrinkVO() {
		
	}
	public DrinkVO(int drinkprice, int drinkstock) {
		this.drinkprice = drinkprice;
		this.drinkstock = drinkstock;
	}
	
	public int getDrinkprice() {
		return drinkprice;
	}
	public void setDrinkprice(int drinkprice) {
		this.drinkprice = drinkprice;
	}
	public int getDrinkstock() {
		return drinkstock;
	}
	public void setDrinkstock(int drinkstock) {
		this.drinkstock = drinkstock;
	}
	
	
}