package org.uengine.chap06.Polymorphism.Inheritance_and_cleanup;

public class Description {
	private String s;
	Description(String s){
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	protected void dispose(){
		System.out.println("disposing Description " + s);
	}
}
