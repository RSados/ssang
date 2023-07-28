package ch06_unit03;

public class Ex02_class {
	public static void main(String[] args) {
		Test2 obj = new Test2();
		int s;

		s = obj.sum(20);
		System.out.println(s);

		System.out.println(obj.isEven(10));
		System.out.println(obj.isEven(11));

		System.out.println(obj.isUpper('A'));
		System.out.println(obj.isLower('a'));
		
		System.out.println(obj.upper('a'));
		
		
		System.out.println(obj.grade(95));
		
		System.out.println(obj.hakjeom(90));
	}
}

class Test2 {
	// 1~n까지 합구하기
	public int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}

//n이 짝수이면 true, 홀수이면 false
	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

//n이 홀수이면 true, 짝수이면 false
	public boolean isIdd(int n) {
		return n % 2 != 0;
	}

//대문자이면 true, 그렇지 않으면 false
	public boolean isUpper(char c) {
		boolean a;
		a = c >= 'A' && c <= 'Z' ? true : false;
		return a;
	}

//소문자이면 true, 그렇지 않으면 false
	public boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}
	
//소문자이면 대문자로 변환
    public char upper(char c) {
    	//return c >= 'a' && c <= 'z' ? c-=32:c ;
    	
    	//다른 메소드를 호출
    	return isLower(c)? (char)(c-32):c;
		
    }
	
//대문자이면 소문자로 변환
    public char lower(char c) {
    	return c >= 'A' && c <= 'Z' ? c+=32:c ;
    	//다른 메소드를 호출
    	//return upper(c)? (char)(c+32):c;
    }
	
//윤년이면 true
    public boolean isLeap(int year) {
    	return year%4==0&&year%100!=0||year%400==0;
    }
	
//점수에 따른 평점(95~:4.5, 90~94:4.0, ... 59~0:0)
    public double grade(int score) {
    	double g=4.5;

    	for(int i=95;i>=60;i-=5) {
    		if(i>score){
        		g-=0.5;
        		break;
    		}
    	}
		if(score<60){
    		g=0;
    		}
		return g;
    }
    //학점 : A,B,C,D,E
    public String hakjeom(int score) {
    	String s;
    	switch(score/10) {
    	case 10:s="A";break;
    	case 9:s="B";break;
    	case 7:s="C";break;
    	case 5:s="D";break;
    	case 3:s="E";break;
    	default :s="F";break;
    	}
    	return s;
    }
	
	
	
}
