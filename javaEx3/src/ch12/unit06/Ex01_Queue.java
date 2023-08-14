package ch12.unit06;

import java.util.LinkedList;
import java.util.Queue;

/*
 - Queue 인터페시으
   : FIFO 구조
   : 구현 클래스 - LinkedList
   : 주요 메소드
    peek() - head 반환 , 없으면 null
    poll() - head 반환 후 삭제, 없으면 null
    offer() - 큐의 마지막에 추가
 */
public class Ex01_Queue {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.offer("자바");
		q.offer("오라클");
		q.offer("서블릿");
		q.offer("스프링");
		q.offer("자바스크립트");
		
		//게임 아이템 사용 등에서 응용
		while(q.peek() != null) {
			String s = q.poll();
			System.out.println(s);
		}
		
		System.out.println(q);
		
	}

}
