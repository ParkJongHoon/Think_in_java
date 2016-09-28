package org.uengine.chap06.Polymorphism.Inheritance_and_cleanup;

public class ReferenceCounting {

	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared)};
		for(Composing c : composing)
			c.dispose();

		for(Composing c : composing)
			c.dispose();
	}

}
