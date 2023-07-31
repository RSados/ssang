package ch06.unit03;

public class Ex13 {
	public static void main(String[] args) {
		Test13 obj = new Test13();
		double a;
		
		a= obj.pow(2, 10);
		System.out.println(a);
		
		//a = obj.pow(2, -2);
		//System.out.println(a);
	}

}

class Test13 {
	//x의 y승 계산
	public double pow(int x, int y) {
		
		if(y==0) {
		 return 1;
		}
		else {
		return x*pow(x,y-1);}
		
		
		
		//if(y>=0) {
		//	return y==0?1:x*pow(x,y-1);
		//}
		//else {
		//	return (1.0/x)*pow(x,y+1);
		//}

	}
}