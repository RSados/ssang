package ch12.unit07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[]aa= {"남1","남2","남3","남4","남5","남6","남7","남8","남9"};
		
		String[]bb= {"여1","여2","여3","여4","여5","여6"};
		
		String[]cc;
		
		String[][]group;
		
		int total, groupCount;
		int ratio,groupNum;
		
		try {
			total = aa.length + bb.length;
			
			System.out.println("몇조로 만들까여 ? ");
			groupCount = sc.nextInt();
			if(groupCount>total) {
				System.out.println("전체 인원수보다 조의 수가 많을 수 없습니다.");
				return;
			}
			
			System.out.println("비율 어캄 [1:같은비율 2. 무작위]?");
			
			ratio = sc.nextInt();
			if(ratio < 1 || ratio > 2) {
				System.out.println("비율은 1 또는 2만 가능합니다.");
				return;
			}
			
			//그룹의 최대 인원수
			groupNum = total % groupCount==0 ? total/groupCount:total/groupCount+1;
			
			group = new String[groupCount][groupNum];
			cc=new String[total];
			
			if(ratio == 1) {
				//같은 비율
				Collections.shuffle(Arrays.asList(aa));
				Collections.shuffle(Arrays.asList(bb));
				
				System.arraycopy(aa, 0, cc, 0, aa.length);
				System.arraycopy(bb, 0, cc, aa.length, bb.length);
			}else {
				System.arraycopy(aa, 0, cc, 0, aa.length);
				System.arraycopy(bb, 0, cc, aa.length, bb.length);
				
				Collections.shuffle(Arrays.asList(cc));
			}
			
			int n = 0;
			gogo:
			for(int col=0; col<groupNum; col++) {
				for(int row = 0;row<groupCount;row++) {
					group[row][col]=cc[n++];
					if(n>=cc.length) {
						break gogo;
					}
				}
			}
			
			System.out.println("\n편성된 조...");
			for(int i=0;i<group.length;i++) {
				System.out.print((i+1)+"조 : ");
				for(int j=0;j<group[i].length;j++) {
					if(group[i][j]!=null) {
						System.out.print(group[i][j]+" ");
					}
				}
				System.out.println();
			}
			
		} finally {
			sc.close();
		}
	}

}
