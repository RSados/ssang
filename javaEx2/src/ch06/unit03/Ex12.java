package ch06.unit03;

public class Ex12 {
	public static void main(String[] args) {
		Test12 obj = new Test12();
		obj.print(3);
	}

}

class Test12{
	public void print (int n) {
		System.out.println("start : "+n);
		
		if(n>1) {
			print(n-1);
			print(n-1);
		}
		System.out.println("end : "+n);
	}
}