package ch05.unit03;

public class Ex02_arraycopy {
	public static void main(String[] args) {
		int []n1 = new int[] {10,20,30,40,50};
		int []n2 = new int[n1.length];
		System.arraycopy(n1, 1, n2, 2, 2);
		for(int n:n2) {//0 0 20 30 0
			System.out.print(n+" ");
		}
			System.out.println();
			
			String[] s1=new String[] {"자바","서블릿","스프링"};
			String[] s2=new String[s1.length+3];
			//초기에 숫자배열은 0으로 초기화, 객체배열은 null로 초기ㅏ
			//null은 메모리 할당을 받지 않은 상태
	System.arraycopy(s1, 0, s2, 1, s1.length-1);
	for(String s:s2) {//null 자바 서블릿 null null null
		System.out.print(s+" ");
	}
	System.out.println();
	}

}
