package drink;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class DrinkImpl implements Drink {
	private Map<String , DrinkVO> map = new HashMap<String, DrinkVO>();
	private int num=3;
	private int income=0;
	Calendar cal = Calendar.getInstance();
	String s=String.format("%tF",cal);
	
	public DrinkImpl() {
		map.put("코카콜라", new DrinkVO(1500, num));
		map.put("환타포도", new DrinkVO(1300, num));
		map.put("삼다수", new DrinkVO(1000, num));
		map.put("봉봉", new DrinkVO(900, num));
		map.put("레쓰비", new DrinkVO(500, num));
	}

	@Override
	public Map<String, DrinkVO> listDrink() {
		return map;
	}
	
	@Override
	public DrinkVO readDrink(String drinkName) {
		DrinkVO vo = map.get(drinkName);
		return vo;
	}

	@Override
	public void insertDrink(String drinkName,DrinkVO vo) {
		map.put(drinkName, vo);
	}

	@Override
	public void income(String drinkName) {
		int ss = map.get(drinkName).getDrinkprice();
		income+=ss;
	}

	@Override
	public int income() {
		System.out.print(s+"의 수익");
		return income;
		
	}

	@Override
	public boolean deleteDrink(String drink) {
		DrinkVO vo = map.remove(drink);
		return vo !=null;
	}

}

	