package ch05.unit03;

public class Ex04_arraycopy {
	public static void main(String[] args) {
		int[][] a= {{10,20,30},{40,50,60}};
		int[][] b=new int[2][3];
		
		for(int i=0;i<a.length;i++) {
			System.arraycopy(a[i], 0, b[i], 0, a[i].length);
			
		}
		System.out.println("a배열...");
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("b배열...");
		for(int i=0; i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.printf("%3d",b[i][j]);
			}
			System.out.println();
		}
		b[1][1]=500;
		System.out.println(a[1][1]+":"+b[1][1]);//50:500
		
		
		
		
	}

}
