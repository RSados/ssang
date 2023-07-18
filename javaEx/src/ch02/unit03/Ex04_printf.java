package ch02.unit03;

public class Ex04_printf {

	public static void main(String[] args) {
		
		//System.out.printf("%d %d \n",123);//런타임 에러 프로그램이 강제종료
        
		//%d : 정수를 출력(int, long)
		System.out.printf("%d\n",12345);
		System.out.printf("%d\n",-12345);
		System.out.printf("%,d\n",12345);// 세자리마다 , 출력
		
		//System.out.printf("%,d\n",220000000000);
		// int 범위를 벗어나므로 컴파일 에러
		System.out.printf("%,d\n\n\n",220000000000l);
		//L 이나 l을 쓰면 int가 아닌 long으로 타입 변경
		//System.out.printf("%,d\n",'A');
		//'A' : 문자 리터널
		//런타임 에러 : %d는 char 형을 출력 할 수 없다.
		
		System.out.printf("012345678921345678454845");
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);//앞에 7칸의 공백이 생김
		// %10d : 10칸으로 숫자를 출력 (출력 자릿수를 지정) 
		System.out.printf("%010d\n",123);//남는 7개의 칸을 0으로 채움
		System.out.printf("%-10d*\n",123);//뒤에 7칸의 공백이 생김 (*은 공백 확인용)
		
		System.out.printf("%2d\n",123);//123
		//정수는 출력할 자릿수가 부족하면 자릿수를 무시하고 출력
	    System.out.println();
	    
	    System.out.printf("%d\n",123);//123
	    System.out.printf("%d\n",-123);//-123
	    System.out.printf("%+d\n",123);//+123
	    System.out.printf("%+d\n",-123);//-123
	    System.out.printf("%(d\n",123);//123
	    System.out.printf("%(d\n",-123);//(123)
	    System.out.println();
	    
	    //%c : 문자 출력
	    //%C : 소문자인 경우 대문자로 변환하여 출력
	    System.out.printf("%c\n",'A');//A
	    System.out.printf("%c\n",'a');//a
	    System.out.printf("%C\n",'A');//A
	    System.out.printf("%C\n",'a');//A
	    
	    System.out.printf("%c\n",65);//A=>아스키 코드 65
	    System.out.printf("%c\n",97);//a=>아스키 코드 97
	    System.out.println();
	    float a='1';
	    System.out.println(a);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
