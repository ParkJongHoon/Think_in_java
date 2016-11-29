package org.uengine.Chap09.Holding_Your_Objects.PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import org.uengine.Chap09.Holding_Your_Objects.Queue.QueueDemo;

public class PriorityQueueDemo {
	/**
	 * PriorityQueue의 핵심은 Sort!!
	 * Queue와 기능은 같으나 PriorityQueue는 offer하는 순간
	 * 안에 담겨진 객체안에서 동적으로 Sort가 되어서
	 * 해당 객체를 poll()이나 remove()시 sort된 순서로 객체가
	 * 빠져나온다.
	 * 또한 sort의 방향도 결정할 수 있다.
	 * @param args
	 */

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue =
				new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for(int i = 0; i < 10; i++)
			priorityQueue.offer(rand.nextInt(i + 10));
		QueueDemo.printQ(priorityQueue);
		
		
		List<Integer> ints = Arrays.asList(25, 22, 20,
				18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		// priorityQueue 생성시 직접 데이터를 집어 넣는 경우
		priorityQueue = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);
		
		// priorityQueue를 생성시 priorityQueue의 환경을 설정하는
		// 경우 1) priorityQueue의 크기
		// 2) sort의 방향 -> Collections.reverseOrder은 역방향
		priorityQueue = new PriorityQueue<Integer>(
				ints.size(), Collections.reverseOrder());
		// 전체 데이터 집어넣는 메소드 priorityQueue.addAll(전체데이터);
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);
		
		
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ =
				new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		
		stringPQ = new PriorityQueue<String>(
				strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);

		// Set 타입은 중복을 없앴다.
		Set<Character> charSet = new HashSet<Character>();
		for(char c: fact.toCharArray())
			charSet.add(c); // Autoboxing
		PriorityQueue<Character> characterPQ =
				new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(characterPQ);
		
	}

}
