package ch06.unit03;

//overloading : 메소드 이름은 동일하지만 메소드의 매개변수의 개수가 다르거나,
//              매개변수의 타입이 다른것을 중복정의라함
public class Ex15_overloading {
	public static void main(String[] args) {
		Test15 t = new Test15();
		
		int a= 10;
		t.disp(a);//1) 매개변수 타입이 일치하는 메소드 호출
		          // int
		
		byte b =10;
		t.disp(b);//1) 매개변수 타입이 일치하는 메소드 호출
		          //2) 타입이 일치하는 것이 없으면 타입이 큰것중 가장 적은 메소드 호출
		          // short
		
		long c = 10L;
		t.disp(c);//float
	}//1) 매개변수 타입이 일치하는 메소드 호출
    //2) 타입이 일치하는 것이 없으면 타입이 큰것중 가장 적은 메소드 호출
	//3) 타입이 큰것이 없으면 에러가 나옴

}

class Test15{
	public void disp() {
		System.out.println("인자없는 메소드...");
		
	}
	/*
	//컴파일 오류. overloading이 아님
	public int disp() {
		return 1;
	}*/
	
	public void disp(short s) {
		System.out.println("short : "+s);
	}
	
	public void disp(int s) {
		System.out.println("int : "+s);
	}
	
	public void disp(float s) {
		System.out.println("float : "+s);
	}
}