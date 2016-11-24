package org.uengine.Chap09.Holding_Your_Objects.Set;

import java.util.*;

public class SetOfInteger {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		
		for(int i =0; i < 100000; i++)
			intset.add(rand.nextInt(30));
		
		System.out.println(intset.size());
		System.out.println(intset);
	}

}
