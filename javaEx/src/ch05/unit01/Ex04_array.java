package ch05.unit01;

/*
 배열은 크기를 변경 할 수 없다.
 배열의 크기를 변경하면 이전 배열은 위치를 참조할수 없다.
 이전 배열은 garbage collector의 대상이 되며 새로운 배열을 만든다
 */
public class Ex04_array {
	public static void main(String[] args) {
		int[]aa =new int[3];
		aa[0]= 10; aa[1]=20;aa[2]=30;
		
		for(int i=0;i<aa.length;i++) {
			System.out.println(aa[i]+"  ");//10,20,30
		}
		System.out.println();
		
		System.out.println("배열의 크기를 변경한 후...");
		aa= new int [5];
		aa[3]=40;aa[4]=50;
		
		for(int i=0;i<aa.length;i++) {
			System.out.print(aa[i]+" ");//0 0 0 40 50
		}
		System.out.println();
	}

}
