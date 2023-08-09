package ch12.unit02.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score score = new ScoreImpl();

	public void menu() {
		int ch;

		System.out.println("\t>> 성적처리-ArrayList <<");

		while (true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.리스트 5.학번검색 6.이름검색 7.종료 => ");
					ch = Integer.parseInt(br.readLine());
				} while (ch < 1 || ch > 7);

				if (ch == 7) {
					return;
				}

				switch (ch) {
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					delete();
					break;
				case 4:
					printAll();
					break;
				case 5:
					findByHak();
					break;
				case 6:
					findByName();
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void insert() {
		System.out.println("\n학생 정보 등록...");

		ScoreVO vo = new ScoreVO();

		try {
			System.out.print("학번 ? ");
			vo.setHak(br.readLine());

			System.out.print("이름 ? ");
			vo.setName(br.readLine());

			// br.readLine() : String
			// Integer.parseInt() : String -> Integer
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));

			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));

			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));

			score.insertScore(vo);// ArrayList에 저장

			System.out.println("등록 완료...");
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 입력 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update() {
		System.out.println("\n학생 정보 수정...");
		
		String hak;
		
		try {
			System.out.print("수정할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = score.readScore(hak);
			if(vo==null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
			
			System.out.println("수정할 이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));

			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));

			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("수정 완료...");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("\n학생 정보 삭제...");
		
		String hak;
		
		try {
			System.out.print("삭제할 학번 ? ");
			hak = br.readLine();
			
			boolean b = score.deleteScore(hak);
			
			if(b) {
				System.out.println("삭제 완료...");
			}else {
				System.out.println("등록된 정보가 아닙니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void printAll() {
		System.out.println("\n전체 리스트...");

		List<ScoreVO> list = score.listScore();

		System.out.println("등록된 인원 : " + list.size());

		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());
		}
	}

	public void findByHak() {
		System.out.println("\n학번 검색...");

		String hak;

		try {
			System.out.print("검색할 학번 ? ");
			hak = br.readLine();

			ScoreVO vo = score.readScore(hak);

			if (vo == null) {
				System.out.println("등록된 정보가 없습니다.\n");
				return;
			}

			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findByName() {
		System.out.println("\n이름 검색...");

		String name;

		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();

			List<ScoreVO> listName = score.listScore(name);
			if (listName.size() == 0) {
				System.out.println("등록된 자료가 없습니다.\n");
				return;
			}

			for (ScoreVO vo : listName) {
				System.out.print(vo.getHak() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMat() + "\t");
				System.out.print(vo.getTot() + "\t");
				System.out.println(vo.getAve());
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
