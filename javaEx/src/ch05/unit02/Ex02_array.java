package ch05.unit02;

public class Ex02_array {
	public static void main(String[] args) {
		//가변 배열
		int [][]a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[5];
		
		System.out.println("배열행수:"+a.length);
		System.out.println("0행 열수:"+a[0].length);
		System.out.println("1행 열수:"+a[1].length);
		System.out.println("2행 열수:"+a[2].length);

	System.out.println(a[0][3]);//
	//System.out.println(a[1][3]);
	
	char c='A';
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=c++;
		}
	}
	for(int i=0; i<a.length;i++) {
		for(int j=0; j<a[i].length;j++) {
			System.out.print((char)a[i][j]+" ");
			
		}
		System.out.println();
	}
	}
	

}
