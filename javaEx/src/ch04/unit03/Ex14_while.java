package ch04.unit03;

//1+(1+2)+...+(1+2+...+10)
public class Ex14_while {
	public static void main(String[] args) {
		int a,b,c;
		a=b=c=0;
		while(a<10) {
			a++;
			b+=a;
			c+=b;
			System.out.print(b+" ");
		}
		System.out.println("합은"+c);//220
	}

}
