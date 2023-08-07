package ch08.unit06;

public class Ex05 {
	public static void main(String[] args) {
		Store st = new Store();
		
		Orange oo = new Orange();
		st.sell(oo);
		
		Apple ap = new Apple();
		st.sell(ap);
	}
}

interface Fruit{
	public int getPrice();
	public String getName();
}

class Apple implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
}

class Orange implements Fruit{

	@Override
	public int getPrice() {
		return 900;
	}

	@Override
	public String getName() {
		return "오렌지";
	}	
}

class Store{
	public void sell(Fruit ft) {
		System.out.println(ft.getName()+" : "+ft.getPrice());
	}
}


