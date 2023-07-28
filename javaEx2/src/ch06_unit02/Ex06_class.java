package ch06_unit02;

public class Ex06_class {
	public static void main(String[] args) {
		/*
		 * T.a=5;
		 컴파일 에러.초기화가 되어 있지 않음
		 */
		
		//Test6 t = null;
		//t.a=5; //런타임 에러 런타임 에러(NullPointweException).메모리 할당 안됨
		
		/*
		 Test6 t = new Test6();//메모리 할당
         t.a=5;
         System.out.println(t.a);//5
		 */
		
		Test6 []tt = new Test6[5];//객체 배열 생성자는 무조건 클래스 이름 다음에 괄호가 와야함
		//Test6 t1=null,t2=null,t3=null,t4=null,t5=null와
		//유사하며, 메모리 할당이 안된 상태
		
		//tt[0].a=5;//런타임 에러(NullPointweException)
		
		for(int i=0; i<tt.length;i++) {//5번 메모리 할당
			tt[i]=new Test6();
		}
		tt[0].a=5;
		System.out.println(tt[0].a);
	}

}


class Test6{
	int a = 10;
	int b= 20;
}








