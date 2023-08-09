package ch11.unit02;

public class Ex08 {
	public static void main(String[] args) {
		Test8 t = new Test8();
		
		t.print("seoul");
		t.print(10);
	}
}

//generic method
class Test8 {
	public <U> void print(U u) {
		System.out.println(u.getClass().getName()+","+u);
	}
	
	public <U extends Number> void disp(U u) {
		System.out.println(u.getClass().getName()+","+u);
	}
}