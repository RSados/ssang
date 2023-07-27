package ch05.unit02;

public class Quiz02 {
	public static void main(String[] args) {
		char[][]c=new char[5][5];
		int a=65;
		//char c= 'A';
		
		for(int i=0;i<c.length;i++) {
			for(int j=4;j>=0;j--) {
				c[j][i]+=(char)a;
				a+=1;
			
			}
		}
		/*
		 for(int i=0;i<5;i++{
		 for(int j=4;j>=0;j--{
		 a[j][i]=c++;}}
		 */
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
