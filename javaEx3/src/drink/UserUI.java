package drink;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class UserUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Drink drink = new DrinkImpl(); 

	MoneyVO mvo = new MoneyVO();

	public UserUI(Drink drink) {
		this.drink = drink;
	}

	public void menu() throws NameVaildException, MoneyLackException {
		int s;

		while (true) {
			try {
				do {
					System.out.println("-----------------------------------");
					System.out.println("1.돈 넣기 2.뽑기 3.잔돈 반환 4.종료하기");
					System.out.println("-----------------------------------");
					System.out.print("선택 => ");
					s = Integer.parseInt(br.readLine());
				} while (s < 1 || s > 4);

				if (s == 4) {
					return;
				}

				switch (s) {
				case 1:
					addInput();
					break;
				case 2:
					buyThing();
					break;
				case 3:
					balanceReturn();
					break;

				}
			}catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void buyThing() throws NameVaildException, MoneyLackException{
		String selection;
		try {
			drinkPrint(); 
			
			System.out.println("현재 잔액: "+mvo.getMoney()+"원");
			System.out.print("\n음료를 선택하세요 >> ");
			selection = br.readLine();
			Map<String, DrinkVO> map = drink.listDrink();

			if (!map.containsKey(selection)) {
				throw new NameVaildException("음료 이름을 정확하게 입력해 주세요");
			}
			if (mvo.getMoney()<map.get(selection).getDrinkprice()) {
				throw new MoneyLackException("돈이 부족합니다.");
			}
			
			int stockNow = map.get(selection).getDrinkstock() - 1;
			if(stockNow < 0) {
				throw new StockLackException("재고가 부족합니다. 다른 음료를 선택해주세용 ㅠㅠ");
			}
			
			System.out.println("    //     //");
			Thread.sleep(500);
			System.out.println("   //  음  //");
			Thread.sleep(500);
			System.out.println("  //  료  //");
			Thread.sleep(500);
			System.out.println(" //  수  //");
			Thread.sleep(500);
			System.out.println(" \\\\  떨  \\\\");
			Thread.sleep(500);
			System.out.println("  \\\\  어  \\\\");
			Thread.sleep(500);
			System.out.println("   \\\\  진  \\\\");
			Thread.sleep(500);
			System.out.println("    \\\\  당  \\\\");
			Thread.sleep(500);

			
			
			System.out.println("\n<" + selection + ">을 뽑았습니다!!");
			System.out.println(map.get(selection).getDrinkprice()+"원 입니다.");
			
			map.get(selection).setDrinkstock(stockNow); 
			mvo.remainMoney(map.get(selection).getDrinkprice());
			drink.income(selection);
			
		
		} catch (NameVaildException e) {
			System.out.println(e.getMessage());
		} catch (MoneyLackException e) {
			System.out.println(e.getMessage());
		} catch (StockLackException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void balanceReturn() {
		System.out.println("\n[잔액반환]");
		mvo.change();
	}

	private void addInput() {
		int money;
		int money2=0; 
		System.out.println("돈을 투입하세요 >>");
		try {
			money = Integer.parseInt(br.readLine());
			money2+=money;
			mvo.setMoney(money2);
		}catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void drinkPrint() {
		// System.out.println("\n[음료 목록]");
		Map<String, DrinkVO> map = drink.listDrink();

		for (String key : map.keySet()) {
			System.out.print(key + "\t|");
		}
		System.out.println();
		for (String key : map.keySet()) {
			DrinkVO value = map.get(key);
			System.out.print(value.getDrinkprice() + "원\t|");
		}
		System.out.println();
	}

}