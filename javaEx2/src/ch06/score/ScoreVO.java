package ch06.score;

public class ScoreVO {//Value Object
	//필드(인스턴스 필드)
	//private : 해당 클래스에서만 접근 가능
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//getter / setter : <shift> + <alt> + <s> + <r>
	public String getHak() {//get + 'H'ak 값을 가져옴
		return hak;
	}
	public void setHak(String hak) {// 값을 넣어줌
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		return kor + eng + mat;
	}
	
	public int getAve() {
		return getTot()/3;
	}
	
	
	
	
	
	
	
	
	
	
}
