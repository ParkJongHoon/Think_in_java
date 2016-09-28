package org.uengine.chap06.Polymorphism.Extensibility;

public class Stringed extends Instrument {
	@Override void play(Note n) {System.out.println("Stringed.play() " + n);}
	@Override String what() {return "Stringed";}
	@Override void adjust() { System.out.println("Adjusting Stringed"); }
}
