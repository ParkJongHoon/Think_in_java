package org.uengine.Chap09.Holding_Your_Objects.Queue;

import java.util.*;

public class QueueDemo {
	/**
	 * Queue FIFO(First In First Out) ����� Container API�̴�
	 * �� ���� ��ɾ �ָ��ؾ� �Ѵ�.
	 * 1) queue.offer("���ڰ�") �ϸ� �ش� value�� �ִ´�.
	 * 2) queue.peek()�� Iterator�� ���ó�� ���� ��ü�� ������ 
	 * true, ������ false�� ��ȯ�Ѵ�.
	 * 3) queue.remove()�ϸ� ���� ��ü�� ��������. 
	 * ����� ���: queue.poll()
	 * �ٸ� ��: return ���� null�̸� poll() null�� ��ȯ�Ѵ�.
	 * �׷��� remove()�� NoSuchElementException�� ����Ų��. 
	 * 
	 *  ���ٿ��� LinkedList�� Queue�������̽��� ������ Ŭ�����̴�.
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
