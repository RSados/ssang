package ch05.unit02;

public class Ex01_array {
	public static void main(String[] args) {
		int [][]a= new int[3][4];
		
		System.out.println("행수: " +a.length);
		System.out.println("0행의 열수 : "+a[0].length);
		
		System.out.println("배열의 참조 위치"+a);
		System.out.println("0행의 참조 위치 : "+a[0]);
		System.out.println("1행 2열의 값 : "+a[1][2]);
	}

}
