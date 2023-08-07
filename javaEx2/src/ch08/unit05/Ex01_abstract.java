package ch08.unit05;

public class Ex01_abstract {
	public static void main(String[] args) {
		int []aa = {23,20,15,48,65,32,8,15,352,56,21,85,};;
		SortInt si = new BubbleSort();
		
		//정렬
		si.sort(aa);
		
		//출력
		for(int a:aa) {
			System.out.println(a+" ");
		}
		System.out.println();

	}
}

abstract class SortInt {
	private int[] value;

	// 추상 메소드
	protected abstract void sorting();

	public void sort(int[] value) {
		this.value = value;
		sorting();
	}

	protected int length() {
		int n = -1;
		if (value != null) {
			n = value.length;
		}
		return n;
	}
	
	protected final int compare(int i, int j) {
		return value[i]- value[j];
	}
	protected final void swap(int i,int j) {
		int t = value[i];
		value[i]=value[j];
		value[j]=t;
	}

}

class SelectionSort extends SortInt{

	@Override
	protected void sorting() {
		for(int i=0;i<length()-1;i++) {
			for(int j=i+1;j<length();j++) {
				if(compare(i, j)>0) {
					swap(i, j);
				}
			}
		}
		
	}
	
}

class BubbleSort extends SortInt{

	@Override
	protected void sorting() {
		boolean flag = true; 
		
		for(int i=1;flag; i++) {
			flag = false;
			
			for(int j=0;j<length()-i;j++) {
				if(compare(j, j+1)>0) {
					swap(j, j+1);
					flag=true;
				}
			}
		}
		
	}
	
}