package ch04.unit03.forEx;

public class Ex07_for {
	public static void main(String[] args) {
		//1~100사이의 수중 3또는 5의 배수로 한줄에 5개씩 출력하고
		// 마지막에 합과 평균 출력
		int sum=0,avg=0;
		
		for (int i=1;i<=100;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
				avg++;
				System.out.print(i+" ");
				if(avg%5==0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n합:"+sum);
		System.out.println("평균:"+(sum/avg));
	}

}
