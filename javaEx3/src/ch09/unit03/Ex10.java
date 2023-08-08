package ch09.unit03;

public class Ex10 {
	public static void main(String[] args) {
		User10 obj = new User10();
		
		obj.setNum(-5);
		int n = obj.getNum();
		
		System.out.println(n);
	}
}

//잘못 작성한 클래스
class User10{
	private int num;
	
	public void setNum(int num) {
		if(num < 0) {
			return;
		}
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}