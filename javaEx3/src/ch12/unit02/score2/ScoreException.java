package ch12.unit02.score2;

//잘못 입력된 점수에 대한 예외
public class ScoreException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ScoreException(String msg) {
		super(msg);
	}

}
