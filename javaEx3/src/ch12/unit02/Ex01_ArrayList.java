package ch12.unit02;

import java.util.ArrayList;
import java.util.List;

/*
 - List 인터페이스
  : 순서가 있다. 배열과 유사한 구조
  : 가변길이 (저장 공간이 부족하면 자동으로 늘어남)
  : 중복적인 요소도 추가 가능
  : 구현 클래스 - ArrayList, Vector, LinkedList등 벡터만 동기화 지원
 */
public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		//up-casting
		List<String> list = new ArrayList<String>();
		String s;
		
		//마지막에 요소 추가
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("광주");
		list.add("서울");//중복적인 요소 추가 가능
		list.add("대전");
		
		System.out.println(list);
		
		//인덱스는 0부터 시작
		//인덱스 2에 대구 추가
		list.add(2, "대구");
		System.out.println(list);
		
		//데이터개수
		System.out.println("개수 : "+list.size());
		
		//처음 데이터 반환
		System.out.println("처음 : " + list.get(0));
		
		//두번째 데이터
		s = list.get(1);
		System.out.println("두번째 : " + s);
		
		//마지막 데이터
		s = list.get(list.size()-1);
		System.out.println("마지막 : " + s);
		
		//처음에 한국 추가
		list.add(0, "한국");
	    System.out.println(list);
		
		//수정
	    list.set(0, "대한민국");
	    System.out.println(list);
	    
	    int idx;
	    //인천은 몇번째 위치
	    idx = list.indexOf("인천");
	    System.out.println(idx);
	    
	    idx = list.indexOf("세종"); // 없으면 -1
	    System.out.println(idx);
		
	    idx = list.indexOf("서울"); // 처음 부터 검색
		System.out.println(idx);
		
		idx = list.lastIndexOf("서울"); // 뒤에서 앞으로 검색
		System.out.println(idx);
		
		System.out.println("부산 존재 유무 : " + list.contains("부산"));
		
		//삭제
		//list.remove("대한민국");
		list.remove(0);
		System.out.println(list);
		
		//모두 삭제
		list.clear();
		System.out.println("모두 삭제후 개수 : "+list.size());
		
	}

}
