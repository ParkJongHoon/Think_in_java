package org.uengine.chap06.Polymorphism.Extensibility;

public class Brass extends Wind {
	@Override void play(Note n) {System.out.println("Brass.play() " + n);}
	@Override void adjust() { System.out.println("Adjusting Brass"); }
}
