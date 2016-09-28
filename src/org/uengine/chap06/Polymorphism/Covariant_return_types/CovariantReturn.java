package org.uengine.chap06.Polymorphism.Covariant_return_types;

public class CovariantReturn {

	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		
		m = new WheatMill();
		g = m.process();
		System.out.println(g);

	}

}
