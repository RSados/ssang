package ch08.unit06;

public class Ex06 {
	public static void main(String[] args) {
		int a;
		
		a=Demo6.sum(10);
		System.out.println(a);//55
		
		Demo6 dd = new DemoImpl6();
		a = dd.max(10, 5);
		System.out.println(a);//10
	}
}

interface Demo6{
	public void write(int n);
	
	public static int sum(int n) {
		int s = 0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		return s;
	}
	
	//JDK 8부터 가능. 구현 클래스에서 override 가능
	public default int max(int x,int y) {
		return x > y ? x:y;
	}
}

class DemoImpl6 implements Demo6{

	@Override
	public void write(int n) {
		System.out.println("write...");
		
	}
	
}