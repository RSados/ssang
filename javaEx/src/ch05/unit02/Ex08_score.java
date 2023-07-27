package ch05.unit02;

import java.util.Scanner;
/* 
 --석차
 점수   석차:초기값을 1로 
 90    1       90:80,90:85,90:80,90:70을 차례대로 비교
 80    1+1+1   80:85,80:80,80:70
 85    1+1     85:80,85:70
 80    1+1+1   80:70
 70    1+1+1+1
 */

public class Ex08_score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name;
		int[][] score;
		int[] tot;
		int[] rank;
		int cnt;

		String[] subject = new String[] { "국어", "영어", "수학" };
		// 인원수는 1이상의 수를 입력 받는다.
		do {
			System.out.print("인원수 ? ");
			cnt = sc.nextInt();
		} while (cnt < 1);

		// 인원수 만큼 배열의 메모리 할당
		name = new String[cnt];
		score = new int[cnt][3];
		tot = new int[cnt];
		rank = new int[cnt];

		// 인원수 만큼 이름,국,영,수 점수를 입력 받아 총점을 계산한다.
		for (int i = 0; i < cnt; i++) {
			System.out.print((i + 1) + "번쨰 이름 ? ");
			name[i] = sc.next();

			// 세과목 점수 입력 및 총점 계산
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(subject[j] + " ? ");
				score[i][j] = sc.nextInt();
				tot[i] += score[i][j];
				// rank[i]=tot[i];
			}
			//석차를 1로 초기화
			rank[i]=1;
		}
		// 석차를 계산한다.
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(tot[i]>tot[j]) {
					rank[j]++;
				}else if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}
		
		
		
		
		
		
		System.out.println();
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("--------------------------------------");
		for (int i = 0; i < cnt; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(tot[i] + "\t");
			System.out.print(tot[i] / 3 + "\t");
			System.out.println(rank[i]);
		}

		sc.close();
	}

}
