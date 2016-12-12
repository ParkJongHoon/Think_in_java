package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		/**
		 * Collections.addAll은 Collection 객체안에
		 * Collections.addAll() 괄안에 들어가는 객체들은 담을 수 있다.
		 * 
		 * 그리고 foreach문을 이용하여 객체를 하나씩 꺼내쓰는 방법
		 */
		Collections.addAll(cs, "Take the long way home".split(" "));
		for(String s: cs)
			System.out.print("'" + s + "' ");

	}

}
