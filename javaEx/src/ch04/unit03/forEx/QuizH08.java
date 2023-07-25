package ch04.unit03.forEx;

public class QuizH08 {
    public static void main(String[] args) {
        int a,b,c,count=0;
		for(a=1;a<=10;a++) {
			for(b=1;b<=10;b++) {
                for(c=1;c<=10;c++){
				if(a*a+b*b==c*c) {
					System.out.printf("a=%d, b=%d, c=%d\n",a,b,c);
                count++;}
    }
}}System.out.println("전체개수 : "+count);
}
}
