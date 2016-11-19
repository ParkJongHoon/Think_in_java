package org.uengine.Chap09.Holding_Your_Objects.Basic_concepts;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

	/**
	 * Collection�� 2������ �����µ� 
	 * 1. list 
	 * 2. set
	 * list�� ������ ������ �ִ�.
	 * set�� ������ ����. �׷��� add()�� �� ��� 
	 * list�� �ߺ���ü�� ����� ���������� set�� ���� ������ �����ϸ� �ȵȴ�.
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
