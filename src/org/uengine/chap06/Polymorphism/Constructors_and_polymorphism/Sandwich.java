package org.uengine.chap06.Polymorphism.Constructors_and_polymorphism;

public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Sandwich(){System.out.println("Sandwich()");}
	public static void main(String[] args) {
		new Sandwich();

	}

}
