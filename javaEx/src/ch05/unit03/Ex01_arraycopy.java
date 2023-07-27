package ch05.unit03;

public class Ex01_arraycopy {
	public static void main(String[] args) {
		int []a= new int[] {10,20,30};
		int []b = a;//a와b는 같은곳을 참조
		int[]c=new int[a.length];
		
		//원본배열, 소스배열의 시작위치, 복사할 배열, 복사시킬배열,복사할개수
		System.arraycopy(a, 0, c, 0, a.length);
		//System.arraycopy(a, 0, c, 0, a.length); //0 10 20
		a[1]=100;
		
		//주소 비교
	    //System.out.println(a==b);//true
	    //System.out.println(a==c);//false
		
		System.out.println("a배열 : ");
		for(int i=0;i<a.length;i++) {//10 100 30
			System.out.print(a[i]+" ");
		}
	    System.out.println("\n");
	    
	    System.out.println("b배열 : ");
		for(int i=0;i<b.length;i++) {//10 100 30
			System.out.print(b[i]+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("c배열 : ");
		for(int i=0;i<c.length;i++) {//10 20 30
			System.out.print(c[i]+" ");
		}
			System.out.println("\n");
			
			
			
			
			
			
		
		
	}

}
