package org.uengine.Chap08.Inner_Classes.Can_inner_classes_be_overridden;

public class Egg {
	private Yolk y;
	protected class Yolk{
		public Yolk(){System.out.println("Egg.Yolk()");}
	}
	public Egg(){
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
