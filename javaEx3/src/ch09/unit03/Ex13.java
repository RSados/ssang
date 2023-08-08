package ch09.unit03;

public class Ex13 {
	public static void main(String[] args) {
		User13 obj = new User13();
		int n;

		// 위 처럼 main() 에서 예외를 throws 할 경우 예외가 발생하면
		// 프로그램은 비 정상적으로 종료된다.
		obj.setNum(-5);

		n = obj.getNum();
		System.out.println(n);

		System.out.println("end...");
	}

}

//잘못 작성한 코드
class User13 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		try {
			if (num < 0) {
				// 강제로 checked exception을 발생 시킴
				throw new Exception("0 이상만 가능합니다.");

			}
			
			this.num = num;
			
		} catch (Exception e) {
			// 위에서 throw new Exception("")한 예외를 이곳에서 catch
			System.out.println(e.toString());
		}
	}

}