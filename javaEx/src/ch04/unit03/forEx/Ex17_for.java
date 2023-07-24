package ch04.unit03.forEx;


/*
    *      5(공백:4)
   ***     6(3)
  *****    7(2) 
 *******   8(1)
*********  9(0)
 *******   8(1)
  *****    7(2)
   ***     6(3)
    *      5(4)
*/
public class Ex17_for {
	public static void main(String[] args) {
	int size=9;
	int n;
	
	n=size/2;
	for(int i=0;i<size;i++) {
		for(int j=0;j<(size-n);j++) {
			System.out.print(j>=n?"*":" ");
		}
		System.out.println();
		n=i<(size/2)?n-1:n+1;
		
	}
		
		
		
		
		
		
		
	}}

