package ch07.unit04;

public class Ex14_StringBuilder {
	public static void main(String[] args) {
		String s = "123456789";
		s=(s+"123").replace("2", "A");
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("123456789");
		sb.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		//456789        424789              4247
		System.out.println(sb);

		StringBuilder sb2 = new StringBuilder("123456789");
		System.out.println(sb2.substring(3,6));//456
		
	}

}
