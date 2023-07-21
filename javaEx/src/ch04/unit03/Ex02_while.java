package ch04.unit03;

public class Ex02_while {
public static void main(String[] args) {
	int n;
	
	n=0;
	while(n<10){
		n+=2;
		System.out.print(n+" ");//2 4 6 8 10
	}
	System.out.println("\n밖: "+n);//10
	}
}
