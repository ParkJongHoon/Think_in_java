package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		/**
		 * Collections.addAll�� Collection ��ü�ȿ�
		 * Collections.addAll() ���ȿ� ���� ��ü���� ���� �� �ִ�.
		 * 
		 * �׸��� foreach���� �̿��Ͽ� ��ü�� �ϳ��� �������� ���
		 */
		Collections.addAll(cs, "Take the long way home".split(" "));
		for(String s: cs)
			System.out.print("'" + s + "' ");

	}

}
