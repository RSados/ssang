package ch07.unit04;

/*
 1~100까지 수를 다음 조건에 따라 한줄에 10개씩 출력
 숫자가 3,6,9인 경우 3,6,9 대신 *를 출력
 1 2 * 4 5 * 7 8 * 10
 11................20
 ..
 * * ** * * ** ....
 */
public class Quiz03 {
	public static void main(String[] args) {
		String s;
		for(int i=1;i<=100;i++) {
			s = Integer.toString(i);
			s=s.replaceAll("(3|6|9)", "*");
			
			if(s.indexOf("*") !=-1) {//뭐가 있다 없다 판별하기 제일 좋은
				s=s.replaceAll("[0-9]", "");//\\d도 사용 가능
			}
			
			System.out.printf("%5s",s);
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
