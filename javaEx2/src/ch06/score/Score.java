package ch06.score;

public class Score {
	// ScoreVO 객체를 저장할수 있는 배열
	private ScoreVO[] list;
	// 저장된 인원수
	private int count;
	
	public Score() {
		allocation(5); // 초기에 5개의 배열 생성
	}
	
	// 배열의 메모리 할당
	// 배열의 크기를 늘려서 이전 배열의 값을 복사
	private void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity];
		
		if(list != null && count > 0) {
			//list 배열이 가지고 있는 배열의 내용을 temp 배열에 복사
		    System.arraycopy(list, 0, temp, 0, count);
		}
		
		list = temp;
	}
	
	// 배열에 ScoreVO 객체를 추가
	public int append(ScoreVO vo) {
		//동일한 학번이 있으면
		if(readScore(vo.getHak())!=null) {
			return -1;
		}
		
		//배열이 꽉 차면 배열의 크기를 10개 늘립
		if(count >= list.length) {
			allocation(list.length+10);
		}
		
		list[count++] = vo;
		
		return count;
	}
	
	// 인원수 반환
	public int getCount() {
		return count;
	}
	
	// 배열의 객체 반환
	public ScoreVO[] getList() {
		return list;
	}
	
	// 학번 조건에 일치하는 ScoreVO 객체 반환
	public ScoreVO readScore(String hak) {
		
		for(int i =0;i<count;i++) {
			ScoreVO vo = list[i];
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		
		return null;//동일한 학번이 없으면 null을 반환
	}
	
	// list 배열에서 ScoreVO 객체 삭제
	public boolean deleteScore(ScoreVO vo) {
		if(vo == null||count == 0) {
			return false;
		}
		
		for(int i = 0; i<count; i++) {
			if(list[i] == vo) {
				deleteScore(i);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean deleteScore(int index) {
		if(index <0||index >= count) {
			return false;
		}
		
		for(int i = index+1;i<=count-1;i++) {
			list[i-1] = list[i];
		}
		count--;
		list[count] = null;
		
		return true;
	}
	
	public double grade(int score) {
		double result;
		
		if(score>=95) result = 4.5;
		else if(score>=90) result = 4.0;
		else if(score>=85) result = 3.5;
		else if(score>=80) result = 3.0;
		else if(score>=75) result = 2.5;
		else if(score>=70) result = 2.0;
		else if(score>=65) result = 1.5;
		else if(score>=60) result = 1.0;
		else result = 0.0;
		
		return result;
	}

}
