package ch04.unit03.forEx;

public class Quiz09 {
	public static void main(String[] args) {
		int sum=0,a=1;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println(a+"~ "+i+"까지의 합:"+sum);//a대신 i-9를 써도 됨
				a=i+1;
				sum=0;
			}

		}
	}

}
