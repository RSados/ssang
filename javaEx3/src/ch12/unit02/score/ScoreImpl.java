package ch12.unit02.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score{
	//학생 정보를 저장할 List 구현 클래스 객체//인스턴스는 무조건 private
	private List<ScoreVO> list = new ArrayList<ScoreVO>();

	@Override
	public void insertScore(ScoreVO vo) {
		// List 객체의 마지막에 요소를 추가
		list.add(vo);
	}

	@Override
	public List<ScoreVO> listScore() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {
		//학번 검색
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = readScore(hak);
		
		if(vo==null) {//학번의 데이터가 없으면
			return false;
		}
		
		//삭제
		list.remove(vo);
		
		return false;
	}

	@Override
	public List<ScoreVO> listScore(String name) {
		// 이름 검색
		List<ScoreVO> listName = new ArrayList<ScoreVO>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().indexOf(name)!=-1) {
				listName.add(vo);
			}
		}
		
		return listName;
	}

}
