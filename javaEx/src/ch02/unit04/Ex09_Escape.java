package ch02.unit04;

//확장열
public class Ex09_Escape {

	public static void main(String[] args) {
		System.out.println("a\tb\tc");//\t: 탭키
		System.out.println("x\ny\nz");//\n:라인 넘기기(10)
		System.out.println("1\\2");
		System.out.println("\"1\"");
		System.out.println('\u0043');//유니코드, C:67(0x43)
		System.out.println('\101');//8진수 101=>10진수 65 =>A

	}

}
