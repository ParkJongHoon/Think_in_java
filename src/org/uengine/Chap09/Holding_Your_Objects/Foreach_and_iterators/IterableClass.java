package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
	/**
	 * 작성일: 2016-12-10
	 * 작성자: 박종훈
	 * 내용:
	 * Iterator 구현하는 방법
	 * 1. Interface Iterable을 implement한다.
	 * 2. 메소드 중 iterator()를 구현해야 하는데
	 *    return 할 Iterator을 임의의 구현을 통해서
	 *    1) hasnext()
	 *    2) next()
	 *    두 메소드를 알맞게 구현한다.
	 */
	protected String[] words = ("And that is how " +
			"we know the Earth to be banana-shaped.").split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index =0;
			public boolean hasNext(){
				return index < words.length;
			}
			public String next() {return words[index++];}
			public void remove(){// Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args){
		for(String s: new IterableClass())
			System.out.print(s + " ");
	}

}
