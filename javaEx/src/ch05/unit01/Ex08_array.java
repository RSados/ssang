package ch05.unit01;

public class Ex08_array {
	public static void main(String[] args) {
		//1~10까지의 난수를 100개 발생하여 한줄에 10개씩 출력하고 마지막에 
		//각 숫자의 발생횟수 출력
		int []a = new int[10];
		int b;
		for(int i=1;i<=100;i++) {
			b=(int)(Math.random()*10);
			System.out.print(b+1+"\t");
			a[b]++;
			/*for(int j=0;j<10;j++) {
				if(b==j) {
					a[j]++;
				}
			}*/
			if(i%10==0) {
				System.out.println();
			}
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.println(i+1+" : "+a[i]);
		}
	}

}
