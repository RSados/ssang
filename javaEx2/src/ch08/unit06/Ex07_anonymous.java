package ch08.unit06;

public class Ex07_anonymous {
	public static void main(String[] args) {
		
		//Demo7 dd = new Demo7();//컴파일 오류
		
		//인터페이스 익명 구현
		Demo7 dd = new Demo7() {
			@Override
			public void disp() {
				System.out.println("disp...");
				
			}
		};
		dd.disp();
	}
}

interface Demo7{
	public void disp();
}


