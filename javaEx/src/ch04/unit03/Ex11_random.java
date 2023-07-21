package ch04.unit03;

/*
 난수:정의된 범위 내에서 무작위로 추출한 수(복원추출)
 Math.random() : 0 <= 난수 < 1 사이의 난수 발생(실수)
 Math.random() * 100 : 0 <= 난수 <100 사이의 난수(실수)
 
 int n 
 n=(int)(Math.random()*100);//0~99 사이의 난수
 n=(int)(Math.random()*100)+1;//0~100 사이의 난수
 n=(int)(Math.random()*45)+1;//1~45 사이의 난수
 */
public class Ex11_random {
	public static void main(String[] args) {
		int n;
		int cnt;
		
		cnt = 0;
		while(cnt<100) {
			cnt++;
			//1에서 100사이의 난수
			n=(int)(Math.random()*100)+1;
			System.out.printf("%5d",n);
			
			if(cnt%10==0) {
				System.out.println();
				
			}
		}
		
		
		
	}

}
