package ch03.unit01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b;//c
		System.out.print("체중(kg) ? ");
		a = sc.nextDouble();
		System.out.print("키(cm) ? ");
		b = sc.nextDouble();
		b=b/100;
		//c=a/(b*b);
		
        System.out.printf("몸무게 : %.2fkg\n키: %.2fm BMI : %.1f",a,b,a/(b*b));
		
		sc.close();
	}

}
