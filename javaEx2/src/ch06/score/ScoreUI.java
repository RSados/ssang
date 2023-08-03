package ch06.score;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score ss = new Score();
	
	public void menu() {
		System.out.println("성적 처리 프로그램...");
		
		int ch;
		while(true) {
			do {
				System.out.print("1.등록 2.수정 3. 삭제 4.학번검색 5.전체리스트 6.평점 7.종료 => ");
				ch = sc.nextInt();
			}while(ch<1||ch>7);
			
			if(ch==7) {
				return;//void 인 경우만 그냥 리턴만함
			}
			
			switch(ch) {
			case 1 : input(); break;
			case 2 : update(); break;
			case 3 : delete(); break;
			case 4 : findByHak(); break;
			case 5 : print(); break;
			case 6 : printGrade(); break;
			}
		}
	}
	//ScoreVO vo = new ScoreVO();//여기에 넣으면 이 ScoreUI가 만들어질떄 한번하고 끝 변수하나로 쓰는거
	public void input() {
		System.out.println("\n데이터 입력...");
		
		ScoreVO vo = new ScoreVO();//input을 부른 수만큼 새로만듬
		
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
		
		//배열에 저장
		int count = ss.append(vo);//원래는 vo는 이 메소드가 사라지며 없어지지만 딴곳으로 빼먹는것
				
				System.out.println("등록 완료 : 전체 인원수 - "+count);
		
		System.out.println();
		
	}
	
	public void update() {
		System.out.println("\n데이터 수정...");
	}
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
	}
	
	public void findByHak() {
		String i;
		System.out.println("\n학번 검색...");
		i=sc.next();
		ScoreVO String = ss.readScore(i);
		
		
	}
		
	public void print() {
		System.out.println("\n전체 리스트...");
		
		ScoreVO[] list = ss.getList();
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
		
		ScoreVO[] list = ss.getList();
		int count = ss.getCount();
		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(ss.grade(vo.getKor())+"\t");
			System.out.print(ss.grade(vo.getEng())+"\t");
			System.out.println(ss.grade(vo.getMat())+"\t");
		}
		System.out.println();
		
		
		
	}
	
	
	
	

}
