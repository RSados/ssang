package ch05.unit02;

public class Quiz01 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n = 1;
		int down;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				down = i % 2 == 0 ? j : 4 - j;
				a[i][down] = n++;
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
