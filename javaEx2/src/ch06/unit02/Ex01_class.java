package ch06.unit02;

public class Ex01_class {
	public static void main(String[] args) {
	//객채 만들기
    //객채 선언(레퍼런스 변수)
	Rect obj;
	
	//객체 생성(메모리 할당)
	obj = new Rect();
	
	//데이터 설정(필드에 값 설정)
	obj.width=10;
	obj.height=20;
	
	int a= obj.area();
	int b= obj.len();
	
	System.out.println("넓이 : "+a);
	System.out.println("둘레 : "+b);
	
	}

}

/*
 - 사각형 넓이와 둘레
 - 추상화 작업
   데이터:가로,세로의 길이
   기능:넓이,둘레
 */
//클래스 : 틀
class Rect{
	// 데이터(필드)
	int width;
	int height;
	
	//기능(메소드)
	public int area() {
		int result=width*height;
		return result;
	}
	public int len() {
		int s = (width+height)*2;
				return s;
	}
	
	
}
