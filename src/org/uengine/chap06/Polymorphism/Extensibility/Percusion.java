package org.uengine.chap06.Polymorphism.Extensibility;

public class Percusion extends Instrument {
	@Override void play(Note n) {System.out.println("Percussion.play() " + n);}
	@Override String what() {return "Percussion";}
	@Override void adjust() { System.out.println("Adjusting Percussion"); }
}
