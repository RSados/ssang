package ch04.unit03.forEx;

public class Ex12_for {
	public static void main(String[] args) {
		int s;
		
		for(int i=2;i<=9;i++) {
			System.out.println("** "+i+"단 **");//8번
			for(int j=1;j<=9;j++) {//8*9=72
				s=i*j;
				System.out.printf("%d * %d = %d\n",i,j,s);
				
			}
			System.out.println();
		}
	}

}
