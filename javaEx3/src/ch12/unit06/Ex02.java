package ch12.unit06;

import java.util.PriorityQueue;

/*
   - PriorityQueue
     : 우선 순위 큐
     : Comparable 인터페이스가 구현된 클래스만 가능
       Comparable 인터페이스 - 정렬할때 기준을 설정
 */

public class Ex02 {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("자바");
		q.offer("오라클");
		q.offer("서블릿");
		q.offer("스프링");
		q.offer("자바스크립트");
		
		while(q.peek()!= null) {
			String s = q.poll();
			System.out.println(s);
		}
	}

}
