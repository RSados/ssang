package drink;

import java.util.Map;

public interface Drink {
	public Map<String, DrinkVO> listDrink();
	public DrinkVO readDrink(String drinkName); 
	public void insertDrink(String drinkName, DrinkVO vo);
	public void income(String drinkName);
	public int income();
	public boolean deleteDrink(String drink);
	
	
}