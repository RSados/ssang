package ch09.unit03;

public class Ex16 {
	public static void main(String[] args) {
		User16 uu = new User16();
		int n;
		
		try {
			uu.setNum(-5);
			n= uu.getNum();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end...");
	}

}

class User16 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<0) {
			// RuntimeException : unchecked exception. 반드시 catch 할 필요가 없음
			throw new RuntimeException("0 이상만 가능합니다.");
		}
		this.num = num;
	}
	
}