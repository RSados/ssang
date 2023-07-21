package ch04.unit03;

public class Quiz07 {
	public static void main(String[] args) {
		int x,y,count;
		x=100;
		y=count=0;
		
		while(x>=y) {
			x+=2;
			y+=5;
			count+=1;
		}
		System.out.printf("x : %d, y : %d\n걸린시간 : %d초",x,y,count);
	}

}
