package ch08.unit03;

public class Ex06 {
	public static void main(String[] args) {
		Object obj = new Test6();
		
		/*
		if(obj instanceof Test6) {
			Test6 t = (Test6)obj;
			t.print();
		}*/
		
		//instanceof 연산자의 패턴 매칭. JDK 14 preview, JDK 16 정식
		if(obj instanceof Test6 t) {
			t.print();
		}
	}

}

class Test6 {
	int a= 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}