package ch06.score;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score ss = new Score();
	
	public void menu() {
		System.out.println("성적처리 프로그램...");
		
		int ch;
		while(true) {
			do {
				System.out.print("1.등록 2.수정 3.삭제 4.학번검색 5.전체리스트 6.평점 7.종료 => ");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 7);
			
			if(ch == 7) {
				return;
			}
			
			switch(ch) {
			case 1: input(); break;
			case 2: update(); break;
			case 3: delete(); break;
			case 4: findByHak(); break;
			case 5: print(); break;
			case 6: printGrade(); break;
			} 
		}
		
	}
	
	public void input() {
		System.out.println("\n데이터 입력...");
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번 ? ");
		vo.setHak(sc.next());
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		// 배열에 저장
		int count = ss.append(vo);
		if(count == -1) {
			System.out.println("등록된 학번입니다.\n");
			return;
		}
		
		System.out.println("등록 완료 : 전체 인원수 - " + count);
		
		System.out.println();
	}
 	
	public void update() {
		System.out.println("\n데이터 수정...");
		
		String hak;
		System.out.print("수정할 학번 ? ");
		hak = sc.next();
		ScoreVO vo = ss.readScore(hak);
		
		if(vo==null) {
			System.out.println("등록된 학번이 아닙니다.\n");
			return;
		}
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		System.out.println("학생정보가 수정되었습니다.");

	}
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		String hak;
		System.out.print("수정할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		
		if(vo==null) {
			System.out.println("등록된 학번이 아닙니다.\n");
			return;
		}
		
		ss.deleteScore(vo);
		
		System.out.println("학생 정보가 삭제되었습니다.");
		
	}
	
	public void findByHak() {
		System.out.println("\n학번 검색...");
		
		String hak;
		
		System.out.println("검색할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		
		if(vo==null) {
			System.out.print("등록된 학번이 아닙니다.\n");
			return;
		}
		
		System.out.println("이름 : "+vo.getName());
		System.out.println("국어 : "+vo.getKor());
		System.out.println("영어 : "+vo.getEng());
		System.out.println("수학 : "+vo.getMat());
		System.out.println();
	}
	
	public void print() {
		System.out.println("\n전체 리스트...");
		
		ScoreVO [] list = ss.getList();
		int count = ss.getCount();
		
		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(vo.getTot()+"\t");
			System.out.println(vo.getAve());
		}
		System.out.println();		
	}
	
	public void printGrade() {
		System.out.println("\n평점 리스트...");
		
		ScoreVO [] list = ss.getList();
		int count = ss.getCount();
		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(ss.grade(vo.getKor())+"\t");
			System.out.print(ss.grade(vo.getEng())+"\t");
			System.out.println(ss.grade(vo.getMat()));
		}
		System.out.println();
		
	}
	
}
