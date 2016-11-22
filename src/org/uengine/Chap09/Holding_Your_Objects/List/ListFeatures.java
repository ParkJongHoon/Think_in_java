package org.uengine.Chap09.Holding_Your_Objects.List;

import java.util.*;

import static net.mindview.util.Print.*;

import org.uengine.Type_Information.*;
import org.uengine.chap03.Initialization_Cleanup.Apple;

public class ListFeatures {

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		print("1: " + pets);
		Hamster h = new Hamster();
		pets.add(h); // Automatically resizes
		print("2: " + pets);
		print("3: " + pets.contains(h));
		Apple a = new Apple();
		print("3_2: " + pets.contains(a));
		
		pets.remove(h); // Remove by object
		Pet p = pets.get(2);
		Pet cymric = new Cymric();
		print("5: " + pets.indexOf(cymric));
		print("5_2: " + pets.indexOf(h));
		print("5_3: " + pets.indexOf(a));
		print("6: " + pets.remove(cymric));
		// Must be the exact object:
		print("7: " + pets.remove(p));
		print("8: " + pets);
		pets.add(3, new Mouse()); // Insert at an index
		print("9: " + pets);
		List<Pet> sub = pets.subList(1, 4);
		print("subList: " + sub);
		print("10: " +pets.containsAll(sub));
		Collections.sort(sub); // In-place sort(글자순 정렬함)
		print("sorted subList: " + sub);
		// Order is not important in containsAll();
		print("11: " + pets.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("12: " + pets.containsAll(sub));
		List<Pet> copy = new ArrayList<Pet>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		print("sub: " + sub);
		print("13_1: " + copy);
		copy.retainAll(sub);
		print("13_2: " + copy);
		copy = new ArrayList<Pet>(pets); // Get a fresh copy
		copy.remove(2); // Remove by index
		print("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		print("15: " + copy);
		copy.set(1, new Mouse());
		print("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		print("17: " + copy);
		print("18: " + pets.isEmpty());
		pets.clear(); // Remove all elements
		print("19: " + pets);
		print("20: " + pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		print("21: " + pets);
		Object[] o = pets.toArray();
		print("22: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		print("23: " + pa[3].id());
		

	}

}
