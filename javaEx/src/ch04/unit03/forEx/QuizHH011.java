package ch04.unit03.forEx;

import java.util.Scanner;

public class QuizHH011 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int user;
		int com;

		while (true) {
			do {
				System.out.println("1.가위 2.바위 3.보 4.게임종료 => ");
				user = sc.nextInt();
			} while (user < 1 || user > 4);

			if (user == 4) {
				break;
			}
			com = (int) (Math.random() * 3) + 1;
			System.out.println("유저 : " + (user == 1 ? "가위" : user == 2 ? "바위" : "보"));
			System.out.println("유저 : " + (com == 1 ? "가위" : com == 2 ? "바위" : "보"));

			if (com - user == 1 || (user == 3 && com == 1)) {
				System.out.println("당신이 졌습니다\n");
			} else if (com == user) {
				System.out.println("당신은 비겼습니다\n");
			} else {
				System.out.println("당신은 이겼습니다\n");
			}
			sc.close();
		}
	}
}
