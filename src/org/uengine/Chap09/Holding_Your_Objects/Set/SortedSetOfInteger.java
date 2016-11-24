package org.uengine.Chap09.Holding_Your_Objects.Set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {

	public static void main(String[] args) {
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for(int i =0; i < 100000; i++)
			intset.add(rand.nextInt(30));
		System.out.println(intset);
	}

}
