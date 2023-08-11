package ch12.unit05.score;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import java.util.TreeMap;

public class ScoreImpl implements Score{
	//private Map<String, ScoreVO> map = new HashMap<String, ScoreVO>();// 키가 무작위로 저장\
	//private Map<String, ScoreVO> map = new TreeMap<String, ScoreVO>();//키 순서로 출력
	private Map<String, ScoreVO> map = new LinkedHashMap<String, ScoreVO>();//키가 등록된수서대로 출력

	@Override
	public void insertScore(String hak, ScoreVO vo) throws MyDuplicationException {
		if(map.containsKey(hak)) {
			throw new MyDuplicationException("등록된 학번입니다.");
		}
		// map에 저장
		map.put(hak, vo);
		
	}

	@Override
	public Map<String, ScoreVO> listMap() {
		// TODO Auto-generated method stub
		return map;
	}

	@Override
	public ScoreVO readScore(String hak) {
		ScoreVO vo = map.get(hak);
		return vo;
	}

	@Override
	public List<ScoreVO> listScore(String name) {//학번이 키값이라 출력 불가 따로 값을 만들거나 Score
		List<ScoreVO> list = new ArrayList<ScoreVO>();
		
		for(String hak : map.keySet()) {
			ScoreVO vo = map.get(hak);
			
			if(vo.getName().startsWith(name)) {
				list.add(vo);
			}
		}
		return list;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = map.remove(hak);//삭제된 데이터를 반환. 없으면 null
		
		return vo !=null;
	}

}
