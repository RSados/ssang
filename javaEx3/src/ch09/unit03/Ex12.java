package ch09.unit03;

public class Ex12 {
	public static void main(String[] args) throws Exception {// throws : 메소드를 호출된 곳에서의 예외를 처리하도록 설정(떠넘기기)
		User12 obj = new User12();
		int n;
		
		//위 처럼 main() 에서 예외를 throws 할 경우 예외가 발생하면
		//프로그램은 비 정상적으로 종료된다.
	    obj.setNum(-5);
	    
		n=obj.getNum();
		System.out.println(n);

		System.out.println("end...");
	}

}

class User12{
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