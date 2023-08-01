package ch07.unit04;

import java.util.Scanner;

/*
 수식을 입력 받아 사칙연산하는 프로그램 작성
 :부호가 없이입력
 :+,-,*,/만 가능
 
 수식? 10+5
 10+5=15
 
 수식? 100-10
 100-10=90
 */
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		//부호를 입력하면 연산안됨
		System.out.print("연산수식 ? ");
		s1=sc.nextLine();
		/*
		s1=s1.replaceAll("\\s", "");//모든 공백제거
		
		String[] ss= s1.split("[\\+|\\-|\\*\\/]");
		char op = s1.charAt(ss[0].length());
		//System.out.println(ss[0]+":"+op+":"+ss[1]);
		
		int n1 = Integer.parseInt(ss[0]);
		int n2 = Integer.parseInt(ss[1]);
		String result = null;
		
		switch(op) {
		case '+' : result = String.format("%d+%d=%d", n1,n2,n1+n2);break;
		case '-' : result = String.format("%d-%d=%d", n1,n2,n1+n2);break;
		case '*' : result = String.format("%d*%d=%d", n1,n2,n1+n2);break;
		case '/' : result = String.format("%d/%d=%d", n1,n2,n1+n2);break;
		}
		System.out.println(result);*/
		/*
		String op = s1.replaceAll("\\d", "");
		int n1=Integer.parseInt(s1.substring(0,s1.indexOf(op)));
		int n2=Integer.parseInt(s1.substring(s1.indexOf(op)+1));
		System.out.println(ss[0]+":"+op+":"+ss[1]);*/
		
		for(String op : new String[] {"+","-","*","/"}) {
			int pos = s1.indexOf(op);
			
			//System.out.println(op+":"+pos);
			if(pos>0) {//if(pos>-1)
				//System.out.println(pos);
				//System.out.println(op);
				//System.out.println(s1.substring(0,pos));
				//System.out.println(s1.substring(pos+1));
				
				int n1=Integer.parseInt(s1.substring(0,pos));
				int n2=Integer.parseInt(s1.substring(pos+1));
				int result =0;
				switch(op) {
				case "+":result = n1+n2;break;
				case "-":result = n1-n2;break;
				case "*":result = n1*n2;break;
				case "/":result = n1/n2;break;
				}
				System.out.println(s1+"="+result);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		if(s1.indexOf("+")>0) {
		String[] s2= s1.split("\\+");
		for(int i=0;i<s2.length;i++) {
			sum+=Integer.valueOf(s2[i]);
		}
		System.out.println(s2[0]+"+"+s2[1]+"="+sum);}
		
		if(s1.indexOf("-")>0) {
		String[] s3= s1.split("-");
		for(int i=0;i<s3.length;i++) {
			sum-=Integer.valueOf(s3[i]);
		}
		System.out.println(s3[0]+"-"+s3[1]+"="+sum);}
		
		if(s1.indexOf("*")>0) {
		String[] s4= s1.split("\\*");
		for(int i=0;i<s4.length;i++) {
			sum*=Integer.valueOf(s4[i]);
		}
		System.out.println(s4[0]+"*"+s4[1]+"="+sum);}
		
		if(s1.indexOf("/")>0) {
		String[] s5= s1.split("/");
		for(int i=0;i<s5.length;i++) {
			sum/=Integer.valueOf(s5[i]);
		}
		System.out.println(s5[0]+"/"+s5[1]+"="+sum);}*/
		sc.close();
	}

}
