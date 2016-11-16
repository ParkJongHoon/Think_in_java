package org.uengine.Chap09.Holding_Your_Objects.Generics_and_type_safe_containers;

import java.util.ArrayList;

public class GenericsAndUpcasting {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for(Apple c : apples)
			System.out.println(c);
		
	}

}
