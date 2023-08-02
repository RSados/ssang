package ch07.unit05;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		//주의 시작일과 주의 마지막 일자 구하기
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 8-1,30);
		cal.getTime();//실제 시간이 변경
		
		System.out.printf("%tF %tA\n",cal,cal);
	
	    //객체 복제 : 주소는 다르지만(서로 다른 객체) 인스턴스 변수가 같은 값을 가진 객체
	    Calendar scal = (Calendar)cal.clone();	
		//System.out.printf("%tF %tA\n",cal,cal);
		//System.out.println(cal==scal);//false
		
		//일요일로 변경-1
		//scal.set(Calendar.DAY_OF_WEEK, 1);
	    
		//일요일로 변경-2
        int w;
	    w = cal.get(Calendar.DAY_OF_WEEK);
	    scal.add(Calendar.DAY_OF_MONTH, -(w-1));
		System.out.printf("%tF %tA\n",scal,scal);

		//객체 복제
		Calendar ecal = (Calendar)cal.clone();
		
		//토요일 변경-1
		//ecal.set(Calendar.DAY_OF_WEEK,7);
		
		//토요일 변경-2
	    w = cal.get(Calendar.DAY_OF_WEEK);
	    ecal.add(Calendar.DAY_OF_MONTH, 7-w);

		System.out.printf("%tF %tA\n",ecal,ecal);

	}

}
