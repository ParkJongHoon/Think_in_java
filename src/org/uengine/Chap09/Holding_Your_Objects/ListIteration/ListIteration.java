package org.uengine.Chap09.Holding_Your_Objects.ListIteration;

import java.util.*;
import org.uengine.Type_Information.*;

public class ListIteration {
	public static void main(String[] args){
		List<Pet> pets = Pets.arrayList(8);
		// listIterator()은 Iterator의 확장판 -> 
		// Iterator은 앞으로 진행하여 객체를 전달했다면
		// listIterator은 이전으로 진행 가능함
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
		// listIterator은 시작 지점을 지정가능함
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
	

}
