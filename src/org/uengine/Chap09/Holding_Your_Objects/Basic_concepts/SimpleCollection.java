package org.uengine.Chap09.Holding_Your_Objects.Basic_concepts;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

	/**
	 * Collection은 2가지로 나뉘는데 
	 * 1. list 
	 * 2. set
	 * list는 순서를 가지고 있다.
	 * set은 순서가 없다. 그래서 add()를 할 경우 
	 * list는 중복객체의 허용이 가능하지만 set은 같은 내용이 존재하면 안된다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	Collection<Integer> c = new ArrayList<Integer>();
	for(int i =0; i < 10; i++)
		c.add(i); 
	for(Integer i: c)
		System.out.print(i + ", ");
	}

}
