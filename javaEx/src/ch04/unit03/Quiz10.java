package ch04.unit03;

public class Quiz10 {
	public static void main(String[] args) {
		int dan,n;
		
		dan=0;
		n=0;
		while(dan <=9) {
                   System.out.println();
			n=2;
			while(n<=9) {
				if(dan==0) {
					System.out.print("** "+ n + "단 **\t");
				}
				
			else {
				System.out.printf("%d * %d = %d\t",n,dan,dan*n);}
				n++;
			}
			dan++;
		}
	}}

/*if(dan==1) {
	System.out.print("** "+ n + "단 **");}
	else if (n==9) {
		System.out.println();
	}
}*/
