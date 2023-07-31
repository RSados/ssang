package ch06.unit03;

public class Ex09_parameter {
	public static void main(String[] args) {
		Test9 t = new Test9();
		int[] nn = {1,3,5,7,9};
		int a;
		
		a=5;
		t.sub1(a);
		System.out.println("a:"+a); // 5
		
		t.sub2(t);
		System.out.println("t.x:"+t.x); // 20
		
		t.sub3(nn);
		System.out.println("nn[1]:"+nn[1]);// 103
		
	}
}

class Test9{
	int x = 10;
	
	public void sub1(int a) {// call by value -> 그냥 파일 복사해서 준거라 받은놈이 뭔 짓을 해도 내 파일은 멀쩡함
		a+=10;
	}
	
	public void sub2(Test9 t) {// call by reference -> 클라우드에 올린 파일이라 딴놈이 뭔짓하면 내파일도 망가짐
		t.x=20;
	}
	
	public void sub3(int[] a) {// call by reference
		a[1]+=100;
	}
	
	
	
	
}