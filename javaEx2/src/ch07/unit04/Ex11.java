package ch07.unit04;

public class Ex11 {
	public static void main(String[] args) {
		String s;
		
		/*

		s="SELECT hak, name, kor, eng, mat " + " FROM score " + " WHERE hak = ? ";
		System.out.println(s);
		*/
		
		//multiline : """~"""
		//JDK 15 부터 정식 스팩에 포함
		s = """
				SELECT hak, name, kor, eng, mat
				FROM score 
				 WHERE hak = ? 
				""";
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
