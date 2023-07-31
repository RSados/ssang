package ch06.unit03;

public class Ex06_class {
	public static void main(String[] args) {
	   Test6 t = new Test6();
	   
	   System.out.println(t.number3());
}
}
class Test6{
	//서로다른 3자리 정수 만들기:102~987
	public int number3() {
		int i,j,k,a=0;
		i=j=k=(int)(Math.random()*9);
		while(i==j) {
			j=(int)(Math.random()*10);
		}
		while(i==k||j==k) {
			k=(int)(Math.random()*10);
		}
		a=(i*100)+(j*10)+k;
		return a;
		/*
		 n1=(int)(Math.random()*9)+1
		 
		 do{n2=(int)(Math.random()*10);
		 }while(n1==n2); ...
		 */
	}
}