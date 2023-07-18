package ch02.unit04;

public class Ex04_DataType {

	public static void main(String[] args) {
		short s1, s2;//-32768~32767
		
		s1='A';//문자는 컴퓨터에 아스키코드로 저장
		//'A':0100 0001=>65
		s2 = 100;
		System.out.println(s1 + "," + s2);//65, 100
		
		int i1 = 200;
		int i2 = 'a';//97
		
		System.out.println(i1 + ","+ i2);// 200,97
		
		i2='대';
		System.out.println(i2);//45824
		
		i2=1+2;
		System.out.println(i2);
		i2 = '1'+'2';//'1':문자->코드값:49,'2':50
		System.out.println(i2);//99
		
		byte b = 30;
		i1 = b; //int>byte, 가능
		System.out.println(i1);//30
		
		//b=i1;//컴파일 에러. 큰자료형(얼마들어있던 알빠아니고)을 작은 자료형에 대입불가
		b = (byte)i1;//강제로 변환하여 넣을순 있으나 오버플로우가 발생가능성있음
		System.out.println(b);
		
		long x= 100;//int 리터널을 long에 대입. long>int이므로 가능
		long y = 200;//long에 리터널을 대입
		
		System.out.println(x+","+y);
		
		//i1 = x;//컴파일 에러
		i1 = (int)x;
		System.out.println(i1);

		
	}

}
