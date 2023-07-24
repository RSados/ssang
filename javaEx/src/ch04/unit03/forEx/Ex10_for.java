package ch04.unit03.forEx;

public class Ex10_for {
	public static void main(String[] args) {
		//다중 for문
		for(int i=1;i<=3;i++) {
			System.out.println("i:"+1);//3번
			
			for(int j=1;j<=2;j++) {//3*2번
				System.out.println(i+":"+j);//3번
			}
			System.out.println("---------------");
		}
	}

}
