package org.uengine.Chap09.Holding_Your_Objects.Iterator;

import java.util.*;
import org.uengine.Type_Information.*;

public class SimpleIteration {
	
	public static void main(String[] args){
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()){ // hasNext(): boolean type -> is next?
			Pet p = it.next(); 
			// next(): setting type is set in the Iterator -> return one object in list(±× °¹¼ö¸¸Å­) 
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		// A simpler approach, when possible:
		for(Pet p: pets)
			System.out.print(p.id() + ":" + p + " ");
		System.out.println();
		// An Iterator can also remove elements:
		it = pets.iterator();
		for(int i =0; i < 6; i ++){
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
}
