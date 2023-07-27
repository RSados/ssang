package ch05.unit02;
/*
 1 6 11 16
 2 7       
 3 8          
 4 9        
 5 10         
 */

public class Ex04_array {
	public static void main(String[] args) {
		

	int[][]a=new int[5][4];
	
	int n=0;
	for(int i=0;i<a[i].length;i++) {//행
		for(int j=0;j<a.length;j++) {//열
			a[j][i]=++n;
		}
	}
	/*for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.printf("%3d",a[i][j]);}
		System.out.println();
}*/
	//2차원 배열을 향상된 for문으로 출력
	for(int i[]:a) {
		for(int j:i) {
			System.out.printf("%3d",j);
			
		}
		System.out.println();
	}

}

}
