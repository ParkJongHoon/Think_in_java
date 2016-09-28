package org.uengine.Chap05.Reusing_Classes.inheritance;

public class Detergent extends Cleanser {
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}
	// Add methods to the interface:
	public void foam(){ append(" foam()");}
	// Test the new class:
	public static void main(String[] args){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(null);
	}

}
