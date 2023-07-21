package ch04.unit03;

public class Ex17_while {
	public static void main(String[] args) {
		//1~100 사이의 수중 3 또는 5의 배수를 제외한 수를 한줄에 5개씩 출력
		
		int a,b;
		a=b=0;
		while(a<100) {
			a++;
			if(a%3!=0&&a%5!=0) {
				b++;
				System.out.print(a+"\t");
				if(b%5==0) {
					System.out.println();
				}
			}
		}
	}

}
