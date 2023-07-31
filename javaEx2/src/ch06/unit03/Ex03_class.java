package ch06.unit03;

public class Ex03_class {
	public static void main(String[] args) {
		Test3 ts = new Test3();
		int n;
		
		n=ts.max(5, 15);
		System.out.println(n);//15
		
		ts.sub(3);//void 메소드는 되돌려 받을것이 없음
		
		String s =ts.week(2023,7,28);
		System.out.println(s);
	}

}

class Test3{
	//두수중 큰수 구하기
	public int max(int a, int b) {//매개변수가 두개인 경우
		return a>b? a:b;
	}
	
	//두수중 작은수 구하기
	public int min(int a, int b) {
		return a>b? b:a;
	}
	
	//리턴 타입: void
	//-> 메소드 실행 후 호출한 곳으로 값을 돌려줄 필요가 없는 경우 사용
	public void sub(int n) {
		int s= n*2;
		
		for(int i=1; i<=s; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		return;//호출한 곳으로 복귀
		    //void인 경우에만 return을 생략할 수 있음
		
		//System.out.println(s);//컴파일 에러
		//return 아래부분은 실행이 불가능 하므로 에러발생
	}
	
	//매개변수로 주어진 구구단 출력.단 1~9 이외의 단을 출력하지 않음
	public void gugudan(int dan) {
		if(dan<1||dan<9) {
			return;
		}
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d",dan,i,dan*i);
		}
	}
	
	// 년,월,일을 인자로 넘겨 받아 요일 구하기
	public String week(int year,int month, int day) {
		int []days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		
		String []weeks = new String[] {"일","월","화","수","목","금","토"};
		days[1]=year%4==0&&year%100!=0||year%400==0?29:28;
		
		int tot = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for(int i=0;i<month-1;i++) {
			tot +=days[i];
		}
		tot +=day;
		
		return weeks[tot%7];
	}
	
	
	
	
}