package ch11.unit02;

//import java.util.Arrays;

public class Ex01_generic {
	public static void main(String[] args) {
		Object[] oo = new Object[5];
		
		//Object : 모든 클래스의 객체참조 가능
		oo[0]=new String("자바");
		oo[1]=new String("오라클");
		oo[2]=90;
		oo[3]=100;
		oo[4]=new String("스프링");
		
		// Arrays.sort(oo); // ClassCastException
		int t = 0;
		for(Object o:oo) {
			//String s = (String)o; // 런타임오류
			//System.out.println(s.length());
			
			if(o instanceof String) {
				String s = (String)o;
				System.out.println(s+":"+s.length());
			}else if(o instanceof Integer) {
				int n = (Integer)o;
				t+=n;
			}
		}
		System.out.println(t);
		
	}

}
