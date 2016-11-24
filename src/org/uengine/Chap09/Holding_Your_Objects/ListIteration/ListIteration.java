package org.uengine.Chap09.Holding_Your_Objects.ListIteration;

import java.util.*;
import org.uengine.Type_Information.*;

public class ListIteration {
	public static void main(String[] args){
		List<Pet> pets = Pets.arrayList(8);
		// listIterator()�� Iterator�� Ȯ���� -> 
		// Iterator�� ������ �����Ͽ� ��ü�� �����ߴٸ�
		// listIterator�� �������� ���� ������
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()){
			System.out.print(it.next() + ", " + it.nextIndex() +
					", " + it.previousIndex() + ";  ");
		}
		System.out.println();
		// Backwards:
		while(it.hasPrevious())
			System.out.print(it.previous().id() + " ");
		System.out.println();
		System.out.println(pets);
		// listIterator�� ���� ������ ����������
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
	

}
