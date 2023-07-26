package ch05.unit01;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int x=0,y=0;
		
		do {
			for(int i =0;i<5;i++) {
			System.out.print(i+1+"번쨰 점수 : ");
			x=sc.nextInt();
			a[i]=x;
			if(x>10||x<0) {
				i--;
				}
			else {
				y+=x;
			}
			}
			break;
			
		}while(true);//for 문을 do while위로 보내고 a[i]<0||a[i]>10);
		for(int i =0;i<5;i++){
		System.out.print(a[i]+" ");
		}

		//가장 큰값과 작은 값을 초기값으로 주기
	    int max=0,min=10;
	    for(int s: a) {
	    	if(max<s) {
	    		max=s;
	    	}
	    	if(min>s) {
	    		min=s;
	    	}
	    }
	    // 가장 처음값을 초기값으로 주기
	    max=min=a[0];
	    for(int i=1;i<a.length;i++) {
	    	if(max<a[i]) {
	    		max=a[i];
	    	}
	    	else if(min>a[i]) {
	    		min=a[i];
	    	}
	    }
	    y=y-max-min;
		System.out.println(y);
		sc.close();
	}

}
