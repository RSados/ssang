package ch05.unit02;

public class Quiz03 {
	public static void main(String[] args) {
		int a[][] = new int[4][5];
		int n = 1;
		int down;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4; j++) {
				down=i%2==0?j:3-j;
				a[down][i] = n++;

			
		}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}

	}

}
