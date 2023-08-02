package ch07.unit04;

public class Ex10_Sort {
	public static void main(String[] args) {
		String[] s = new String[] {"서울","부산","대구","인천","광주","대전","울산","세종"};
		
		System.out.println("Source Data : ");
		disp(s);
		System.out.println();
		
		//Arrays.sort(s);
		bubbleSort(s);
		
		System.out.println("Sort Data : ");
		disp(s);
		System.out.println();						
		
	}
	
	public static void disp(String[] ss) {
		for(String s:ss) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(String[]ss) {
		boolean flag = true;
		String t;
		
		for(int i=1;flag;i++) {
			flag = false;
			
			for(int j=0;j<ss.length-i;j++) {
				if(ss[j].compareTo(ss[j+1])>0) {
					//compareTo() : 사전식 비교, 코드 차이
					t=ss[j];
					ss[j]=ss[j+1];
					ss[j+1]=t;
					flag = true;
				}
			}
		}
	}

}
