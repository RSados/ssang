package drink;

import java.util.List;

public interface Drink {
	public List<DrinkVO> list();
	public DrinkVO readDrink(String drinkName);
	public void insertDrink(DrinkVO vo);
	public boolean deleteDrink(String drinkName);
	public int profitDrink();
}
