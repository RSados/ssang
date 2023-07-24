package ch04.unit03.forEx;

public class Ex08_for {
	public static void main(String[] args) {
		//무한루프
		/*
	}
		int s=0, n=0;

		for(;;) {//while(true)
			n++;
			s+=n;
			if(n>=10) {break;
		}
	}
		System.out.println("결과:" +s);*/
		
		int s=0;
		for(int n=1; ;n++) {
			s+=n;
			if(n>=10) {
				break;
			}
		}
	}

}
