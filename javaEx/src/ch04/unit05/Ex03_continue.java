package ch04.unit05;

public class Ex03_continue {
	public static void main(String[] args) {
		/*
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) {
					continue;// for(int j=1...에서 j++실행
				}
				System.out.println(i+","+j);
			}
		}*/	
		jump:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i+j==4) {
					continue jump;// for(int i=1...에서 i++실행
				}
				System.out.println(i+","+j);
			}
		}
	}

}
