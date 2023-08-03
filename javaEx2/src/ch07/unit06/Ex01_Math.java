package ch07.unit06;

public class Ex01_Math {
	public static void main(String[] args) {
		double e;
		
		System.out.println("원주율 : "+ Math.PI);
		
		e = Math.sin(30.0*Math.PI/180);//각도는 라디안
		System.out.println(e);
		
		e = Math.sqrt(2.0);//제곱근
		System.out.println(e);
		
		e= Math.floor(12.77);//절삭
		System.out.println(e);//12.0
		
		e = Math.pow(2, 10);//2의 10승
		System.out.println(e);
		
		e = Math.random();//0<=난수 <1
		System.out.println(e);
		
		int n = (int)(Math.random()*100);//0~99
		System.out.println(n);
		
		
	}

}
