package org.uengine.chap06.Polymorphism.Extensibility;

public class Wind extends Instrument {
	@Override void play(Note n) {System.out.println("Wind.play() " + n);}
	@Override String what() {return "Wind";}
	@Override void adjust() { System.out.println("Adjusting Wind"); }
}
