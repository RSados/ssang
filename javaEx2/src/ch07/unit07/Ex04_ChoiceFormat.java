package ch07.unit07;

import java.text.ChoiceFormat;

public class Ex04_ChoiceFormat {
	public static void main(String[] args) {
		//ChoiceFormat : 특정 값의 범위를 문자열로 변환
		
		double[] limit = {0,60,70,80,90};//적은수에서 큰수 순으로 입력
		String[] grade = {"F","D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(limit,grade);
		
		System.out.println("95:"+cf.format(95));//A
		System.out.println("80:"+cf.format(80));//B
		System.out.println("55:"+cf.format(55));//F
		System.out.println();
		
		limit = new double[] {60,70,80,90};
		grade = new String[]{"D","C","B","A"};
		ChoiceFormat cf2 = new ChoiceFormat(limit,grade);
		
		System.out.println("95:"+cf2.format(95));//A
		System.out.println("80:"+cf2.format(80));//B
		System.out.println("55:"+cf2.format(55));//D//자기보다 낮은 숫자를 찾지못해서 그나마 가장 가까이 있는 D
		System.out.println();
		
		limit = new double[] {0,60,65,70,75,80,85,90,95};
		grade = new String[]{"0.0","1.0","1.5","2.0","2.5","3.0","3.5","4.0","4.5"};
		ChoiceFormat cf3 = new ChoiceFormat(limit,grade);
		
		System.out.println("95:"+cf3.format(95));//A
		System.out.println("80:"+cf3.format(80));//B
		System.out.println("55:"+cf3.format(55));
		
		double d;
		d = Double.parseDouble(cf3.format(83));
		System.out.println(d);
	}

}
