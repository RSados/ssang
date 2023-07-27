package ch05.unit02;

public class Ex07_array {
	public static void main(String[] args) {
		int[][]a= {{1,5,6},{2,4,7},{2,5,8}};
		int[][]b= {{7,1,6},{3,4,7},{4,6,3}};
		
		int[][]c=new int[3][3];
		int[][]d=new int[3][3];
		
		//행렬의 합
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i[]:c) {
			for(int j:i) {
				System.out.printf("%3d",j);
			}
			System.out.println();
		}
		System.out.println();
		//행렬의 곱
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					d[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
		for(int i[]:d) {
			for(int j:i) {
				System.out.printf("%3d",j);
			}
			System.out.println();
		}

}}
