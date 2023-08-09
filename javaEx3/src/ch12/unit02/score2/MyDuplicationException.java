package ch12.unit02.score2;

//학번 중복 예외
public class MyDuplicationException extends Exception{
	private static final long serialVersionUID = 1L;

	public MyDuplicationException(String msg) {
		super(msg);
	}
}
