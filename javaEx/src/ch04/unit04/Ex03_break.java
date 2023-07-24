package ch04.unit04;

public class Ex03_break {
	public static void main(String[] args) {
		/*
		for(int i=1;i<=3;i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break;//for(int j=1;...)문을 빠져 나감
				}
				System.out.println(i+","+j);
				//1,1
				//1,2
				//2,1
			}
		}*/
		
		gogo:
			for(int i=1; i<=3;i++) {
				for(int j=1;j<=3;j++) {
					if(i+j==4) {
						break gogo;//for(int i=1..)문을 빠져 나감
					}
					System.out.println(i+","+j);
				}
			}
	}

}
