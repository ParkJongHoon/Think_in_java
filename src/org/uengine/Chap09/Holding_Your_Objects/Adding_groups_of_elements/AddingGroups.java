package org.uengine.Chap09.Holding_Your_Objects.Adding_groups_of_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	/**
	 * Arrays, Collections -> java.util�ȿ� �ִ� ��ü�� �׷��� ���ϴ� Collection
	 * Arrays ��� Arrays.asList()��  ��ü�� ������ ���ϴ� �޼ҵ尡 ����(static ���¶�� ����)
	 * Arrays.asList() ��ȣ�ȿ� �� �������� ������ ',' �� �����Ͽ� �����(','��  token ������ ��)
	 * Collections.addAll()�ȿ� ���� �������� �ݷ��� ��ü�� ��Ÿ ��ü�� ����Ʈ�� ���� �� �ִ�. �Ʒ��ڵ� ����
	 * Arrays.asList()�� List��ü������ ��밡���ϸ� �� collection�� �ٸ���
	 * List�� ���� ���� ��(��ü �������� ���� ����) List������ ���� �� �ְ� ��µ� �����ϴ� 
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = {6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // Ok -- modify an element
		// list.add(21); // Runtime error because the
						// underlying array cannot be resized.
		
		
		System.out.println("-------------collection------------------");
		System.out.println("collection�� ������: " + collection.size());
		int counter = 0;
		for(Integer i: collection){
			counter++;
			System.out.print(counter + "��°:");
			System.out.println(i);
		}
		counter = 0;
		System.out.println("-------------/collection------------------");
		System.out.println();
		System.out.println("list�� ������: " + list.size());
		System.out.println("-------------list------------------");
		for(Integer i: list){
			counter++;
			System.out.print(counter + "��°:");
			System.out.println(i);
		}
		System.out.println("-------------/list------------------");
		

	}

}
