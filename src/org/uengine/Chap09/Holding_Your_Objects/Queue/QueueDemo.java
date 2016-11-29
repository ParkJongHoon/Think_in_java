package org.uengine.Chap09.Holding_Your_Objects.Queue;

import java.util.*;

public class QueueDemo {
	/**
	 * Queue FIFO(First In First Out) 방식의 Container API이다
	 * 두 가지 명령어를 주목해야 한다.
	 * 1) queue.offer("인자값") 하면 해당 value를 넣는다.
	 * 2) queue.peek()은 Iterator의 기능처럼 다음 객체가 있으면 
	 * true, 없으면 false를 반환한다.
	 * 3) queue.remove()하면 들어온 객체를 내보낸다. 
	 * 비슷한 기능: queue.poll()
	 * 다른 점: return 값이 null이면 poll() null을 반환한다.
	 * 그러나 remove()는 NoSuchElementException을 일으킨다. 
	 * 
	 *  덧붙여서 LinkedList는 Queue인터페이스를 구현한 클래스이다.
	 * @param queue
	 */
	public static void printQ(Queue queue){
		while(queue.peek() != null){
			System.out.print(queue.remove() +  " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i =0; i < 10; i ++){
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c: "Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
	}

}
