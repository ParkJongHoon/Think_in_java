package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
	/**
	 * �ۼ���: 2016-12-10
	 * �ۼ���: ������
	 * ����:
	 * Iterator �����ϴ� ���
	 * 1. Interface Iterable�� implement�Ѵ�.
	 * 2. �޼ҵ� �� iterator()�� �����ؾ� �ϴµ�
	 *    return �� Iterator�� ������ ������ ���ؼ�
	 *    1) hasnext()
	 *    2) next()
	 *    �� �޼ҵ带 �˸°� �����Ѵ�.
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
