package ch06.unit04;

public class Ex04_this {
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.set(5);
		t.print();
		t.disp();
	}

}
//필드와 지역변수(매개변수)와 변수명이 동일하면 지역변수(매개변수)가 우선순위가 높음 // 아무리 전국구라도 나와바리에서는 먹고 들어감
class Test4 {
	private int a;
	private int b;
	private int c=5;
	
    public void set(int b) {
    	a=10;//필드 a
    	b=b+100;//매개변수 b
    }
    	public void print() {
    		int c= 50;
    		System.out.println(a+","+b+","+c);//필드, 필드, 지역변수
    	}
    	public void disp() {
    		System.out.println(a+","+b+","+c);//필드, 필드, 필드
    	}
    
}
