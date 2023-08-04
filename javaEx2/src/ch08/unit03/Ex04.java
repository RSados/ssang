package ch08.unit03;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		Object obj = "korea";//up-casting
		
		//System.out.println(obj.length());//컴에러.length는 스트링의 메소드이니까
		System.out.println(((String)obj).length());//다운 캐스팅
		
		//up-casting
		Object n1 = 10;
		Object n2 = 20;
		
		//Object n3 = n1+n2;//컴오류.기본자료형이나 wrepper 스트링 같은 놈들은 가능
		int n3 = (Integer)n1+(Integer)n2;//다운 캐스팅
		System.out.println(n3);
		
		/*
		Object[] oo = {"seoul",90,80,"korea"};
		Arrays.sort(oo);
		*/
		Object[] oo = {"seoul","korea","jeoju"};
		Arrays.sort(oo);
		for(Object o : oo) {
			System.out.println(o);
		}
		
		
	}

}
