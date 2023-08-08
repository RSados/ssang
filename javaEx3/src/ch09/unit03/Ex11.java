package ch09.unit03;

public class Ex11 {
	public static void main(String[] args) {
		User11 obj = new User11();
		int n;
		
		try {
			obj.setNum(-5);
			n=obj.getNum();
			System.out.println(n);
		} catch (Exception e) {
			//printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end...");
	}

}

class User11{
	private int num;

	public int getNum() {
		return num;
	}
	
	//throws : 메소드를 호출한 곳에서 예외를 catch하도록 설정
	public void setNum(int num)throws Exception {//메소드 뒤에만 붙음 호출하는곳에서 예외를 catch하도록 설정
		if(num < 0) {
			//강제로 checked exception을 발생 시킴
			throw new Exception("0 이상만 가능합니다.");//예외를 발생시키는것
		}
		this.num = num;
	}
	
}