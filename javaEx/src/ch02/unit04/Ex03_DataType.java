package ch02.unit04;

public class Ex03_DataType {
                
	public static void main(String[] args) {
		byte a;//선언만
		byte b=120;//선언과 동시에 초기화
	
	    //System.out.println(a);//컴파일 에러선언만 하고 초기화를 하지 않았기에
		System.out.println(b);
		
		//a=129;//컴파일 에러 .byte는 -128~127까지만 가능
		
		a=(byte)129;//overflow가 발생하여 잘림이 발생
		System.out.println(a);//-127
		
		a=(byte)385;
		System.out.println(a);//-127
		
		
		
		
}
	
}
