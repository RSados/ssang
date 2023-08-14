package drink;

public class DrinkException {

}
class NameVaildException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NameVaildException(String msg) {
		super(msg);
		
	}
}
class MoneyLackException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public MoneyLackException(String msg) {
		super(msg);
		
	}
}

class StockLackException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public StockLackException(String msg) {
		super(msg);
		
	}
}