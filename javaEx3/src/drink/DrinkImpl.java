package drink;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class DrinkImpl implements Drink{
	private List<DrinkVO> list = new ArrayList<>();
	private int profit;

	@Override
	public List<DrinkVO> list() {
		
		return null;
	}

	@Override
	public DrinkVO readDrink(String drinkName) {
		//입력한 드링크 이름과 저장된 드링크 객체중 이름이 같은거 출력
		for(DrinkVO vo : list) {
			if(vo.getDrinkname().equals(drinkName) ) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void insertDrink(DrinkVO vo) {
		//드링크 추가
		list.add(vo);
		
	}

	@Override
	public boolean deleteDrink(String drinkName) {
		//이름으로 드링크 찾아서 삭제
		DrinkVO vo = readDrink(drinkName);
		
		if(vo==null) {
			return false;
		}
		
		list.remove(vo);
		
		return true;
	}

	@Override
	public int profitDrink() {
		//그날의 이익
		return 0;
	}
	
}
