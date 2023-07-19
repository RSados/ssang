package ch03.unit01;

public class Ex13 {
	public static void main(String[] args) {
		char a;
		
		a= 'A';
		
		//a= (char)(a+1);//컴파일 에러 int를 char에 넣을수 없다
		//System.out.println(a);//b
		
		a++;//++a와 같음, ++는 형변환이 일어나지 않는다.
		System.out.println(a);//b
		
		a = 'A';
		System.out.println((a++)+","+(++a));//A,C
		
		double b = 4.5;
		b++;
		System.out.println(b);//5.5
		
		
		
		
	}

}
