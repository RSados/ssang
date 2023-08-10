package ch12.unit02;

import java.util.Iterator;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		//ArrayList : 동기화 지원하지 않음 (멀티 스레드 환경에서 안전하지 않음)
		//Vector : 동기화 지원((멀티 스레드 환경에서 안전)
		
		Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		
		System.out.println("초기용량 : "+ list.capacity()); // 10
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		list.add("a7");
		list.add("a8");
		list.add("a9");
		list.add("a10");
		list.add("a11");
		list.add("a12");
		list.add("a13");
		list.add("a14");
		list.add("a15");
		
		System.out.println("개수 : " + list.size()); // 15
		System.out.println("용량 : "+ list.capacity()); // 20
			//용량이 부족하면 10개씩 증가
		
		list.add(0,"korea");
		System.out.println(list);
		
		System.out.println("처음:" + list.get(0));
		System.out.println("처음:" + list.firstElement());
		
		System.out.println("마지막:" + list.get(list.size()-1));
		System.out.println("마지막:" + list.lastElement());
		
		list.set(0, "대한민국");
		System.out.println(list);
		
		System.out.println("전체 출력 1...");
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("전체 출력 2...");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("전체 출력 3...");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		int idx = list.indexOf("a7"); // 없으면 -1
		System.out.println(idx);
		
		list.remove(3);
		list.remove("a7");
		System.out.println(list);
		
		list.clear(); // 모두 지우기
		System.out.println("개수 : " + list.size());
		System.out.println("용량 : " + list.capacity());
		
		//용량을 개수
		list.trimToSize();
		System.out.println("용량 : " + list.capacity());
		
		
		
		
		
		
		
		
		
		
		
	}

}
