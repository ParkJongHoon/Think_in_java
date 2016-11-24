package org.uengine.Chap09.Holding_Your_Objects.Iterator;

import java.util.*;
import org.uengine.Type_Information.*;

public class CrossContainerIteration {
	// Iterator 기능 을 메소드로 묶어서 list type 객체에서 공통으로
	// 사용할 수 있도록 했다.
	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p  = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS = new HashSet<Pet>(pets);
		TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
	}
}
