package org.uengine.chap06.Polymorphism.Inheritance_and_cleanup;

public class Characteristic {
	private String s;
	public Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
	protected void dispose(){
		System.out.println("disposing Characteristic " + s);
	}

}
