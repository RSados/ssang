package ch09.unit01;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(City.SEOUL);
		    //서울인구 : 1000만명 출력
		    //toString()를 재정의 하지 않으면 SEOUL 출력
		System.out.println("서울 : "+ City.SEOUL.getCount());
		
		for(City c:City.values()) {
			System.out.println(c.getName()+"->"+c.getCount());
		}
	}

}

//열거형에 상수 값 할당 - 생성자를 만들어야 함
enum City{
	SEOUL("서울",1000),
	BUSAN("부산",350),
	INCHON("인천",330);
	
	private String name;
	private int count;
	
	//생성자는 private만 가능. private 생략해도 private
	private City(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return this.name+"인구 : "+count + "만명";
	}
}