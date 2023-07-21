package ch04.unit03;

public class QuizH01 {
	public static void main(String[] args) {
		int count,sum;
		count=sum=0;
		
		while(sum<100) {
			count++;
			if(count%2==1) {
				sum+=count;
			}
			else {
				sum-=count;
			}
			if(count==300) {
				break;
			}
		}
		System.out.printf("n : %d, s: %d",count,sum);
	}

}
