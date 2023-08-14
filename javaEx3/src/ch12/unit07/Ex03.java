package ch12.unit07;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		String[] ss = new String[] { "java", "css", "html", "javascript", "spring", };

		System.out.println(Arrays.toString(ss));

		// List<String> list = new ArrayList<String>(Arrays.asList(ss));

		Collections.shuffle(Arrays.asList(ss));

		System.out.println(Arrays.toString(ss));
	}
}
