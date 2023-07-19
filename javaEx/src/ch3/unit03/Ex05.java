package ch3.unit03;

public class Ex05 {
	public static void main(String[] args) {
		int a,b;
		
		a=128;
		System.out.println("a:"+a);
		
		b=a<<3;//128*2의3승
		System.out.println("128 << 3 : "+b);//1024
		
		b=a>>3;//128/2의3승
		System.out.println("128 >> 3 : "+b);//16
		
		a=-128;
		
		b=a<<3;//128*2의3승
		System.out.println("128 << 3 : "+b);//-1024
		
		b=a>>3;//128/2의3승
		System.out.println("128 >> 3 : "+b);//-16
		
		b=a>>>3;
		System.out.println("128 >> 3 : "+b);//536870896
		b=a>>>1;
		System.out.println("128 >> 1 : "+b);//2147483584
	}

}
