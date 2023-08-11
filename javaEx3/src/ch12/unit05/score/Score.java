package ch12.unit05.score;

import java.util.List;
import java.util.Map;

public interface Score {
	public void insertScore(String hak, ScoreVO vo) throws MyDuplicationException; 
	public Map<String, ScoreVO> listMap();
	public ScoreVO readScore(String hak);
	public List<ScoreVO> listScore(String name);
	public boolean deleteScore(String hak);

}
