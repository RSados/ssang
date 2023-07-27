package ch05.unit02;

public class Ex05_array {
	public static void main(String[] args) {
		
	// 5*4행렬에 1~100 사이의 난수를 발생하여 대입한후 출력하고
	//5행렬에 4*5행렬로 변환하여 출력
		int [][]a=new int [5][4];
		int [][]b = new int [4][5];
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*100)+1;
			}
		}
		
		//5*4행렬을 4*5행렬로 변환
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=a[j][i];
			}
		}
		System.out.println("5*4 행렬....");
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("4*5 행렬....");
		for(int i=0; i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.printf("%4d",b[i][j]);
			}
			System.out.println();
		}

}
}