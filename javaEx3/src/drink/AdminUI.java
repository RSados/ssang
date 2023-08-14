package drink;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class AdminUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@SuppressWarnings("unused")
	private String DrinkId = "3조";
	@SuppressWarnings("unused")
	private String Drinkpwd = "3조";

	private Drink drink = new DrinkImpl();

	public AdminUI(Drink drink) {
		this.drink = drink;
	}

	public void login() {
		String id, pwd;
		int cnt = 0;
		boolean b = false;

		do {
			try {
				System.out.print("\n아이디 ? ");
				id = br.readLine();
				System.out.print("패스워드 ? ");
				pwd = br.readLine();
				b = DrinkId.equals(id) && Drinkpwd.equals(pwd);
				cnt++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (cnt < 3 && !b);

		if (!b) {
			System.out.println();
			return;
		}

		menu();
	}

	protected void menu() {
		int s;

		while (true) {
			try {
				do {
					System.out.println("---------------------------------------------------------");
					System.out.println("1.재고출력 2.가격&품목 변경 3.수익확인 4.물품추가 5.물품삭제 6.종료");
					System.out.println("---------------------------------------------------------");
					System.out.print("선택 => ");
					s = Integer.parseInt(br.readLine());
				} while (s < 1 || s > 6);

				if (s == 6) {
					return;
				}

				switch (s) {
				case 1:
					stockManage();
					break;
				case 2:
					stockChange();
					break;
				case 3:
					profitCheck();
					break;
				case 4:
					addStock();
					break;
				case 5:
					deleteStock();
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void drinkPrint() {
		Map<String, DrinkVO> map = drink.listDrink();

		for (String key : map.keySet()) {
			System.out.print(key + "\t|");
		}
		System.out.println();
		for (String key : map.keySet()) {
			DrinkVO value = map.get(key);
			System.out.print(value.getDrinkstock() + "개\t|");
		}
		System.out.println();
	}

	public void stockManage() {
		System.out.println("\n[재고출력]");
		drinkPrint();
	}

	public void stockChange() {
		System.out.println("\n[가격&재고 변경]");
		drinkPrint();

		String stock;
		try {
			System.out.print("수정할 품목 ? ");
			stock = br.readLine();

			DrinkVO vo = drink.readDrink(stock);
			if (vo == null) {
				System.out.println("등록된 품목이 아닙니다.");
				return;
			}

			int p, s;

			System.out.print("수정할 가격 ?");
			p = Integer.parseInt(br.readLine());

			System.out.print("수정할 수량 ?");
			s = Integer.parseInt(br.readLine());

			vo.setDrinkprice(p);
			vo.setDrinkstock(s);

			System.out.println("음료 수정 완료.");

		} catch (NumberFormatException e) {
			System.out.println("가격과 수량은 숫자만 가능합니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void profitCheck() {
		int s = drink.income();
		System.out.println("\n[수익확인]");
		System.out.printf("%,d\n원", s);

	}

	public void addStock() {
		System.out.println("\n[물품추가]");
		String stock;

		try {
			DrinkVO vo = new DrinkVO();

			int p, s;

			System.out.println("추가할 물품?");
			stock = br.readLine();

			System.out.println("물품의 가격 ?");
			p = Integer.parseInt(br.readLine());

			System.out.println("물품의 수량 ?");
			s = Integer.parseInt(br.readLine());

			vo.setDrinkprice(p);
			vo.setDrinkstock(s);

			drink.insertDrink(stock, vo);

		} catch (NumberFormatException e) {
			System.out.println("가격과 수량은 숫자만 입력 가능합니다.");

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println();

	}

	public void deleteStock() {
		System.out.println("\n[물품삭제]");
		String stock;
		DrinkVO vo = new DrinkVO();

		try {
			System.out.print("삭제할 물품을 입력해주세요");
			stock = br.readLine();
			vo = drink.readDrink(stock);
			if (vo == null) {
				System.out.println("등록된 음료가 아닙니다.\n");
				return;
			}
			drink.deleteDrink(stock);
			System.out.println("데이터 삭제 완료...");
		} catch (Exception e) {

		}

	}

}
