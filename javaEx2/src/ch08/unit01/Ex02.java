package ch08.unit01;

public class Ex02 {
	public static void main(String[] args) {
		Demo2 dd = new Demo2();
		dd.disp();
	}
}

class Test2{
	int a=10;
	int b=20;
	
	public void print() {
		System.out.println(a+","+b);
		//System.out.println(this.a+","+this.b);
		  //지역변수에 a, b 변수가 없으므로 this 생략가능
	}
}

class Demo2 extends Test2 {
	int b = 200;
	int c = 300;
	int d = 400;
	
	public void disp() {
		int c = 35;
		
		System.out.println("a:"+a);//super 클래스의 a 
		System.out.println("this.a:"+this.a);//super 클래스의 a 
		System.out.println("super.a:"+super.a);//super 클래스의 a 

		System.out.println("b:"+b);// 자신 클래스의 b
		System.out.println("super.b:"+super.b);//super 클래스의 b
		
		System.out.println("c:"+c);//지역변수 c
		System.out.println("this.c:"+this.c);//자신 클래스의 c
		
		System.out.println("d:"+d);
		//System.out.println("this.d:"+this.d);//this 생략가능
		
		
		
	}
	
}




