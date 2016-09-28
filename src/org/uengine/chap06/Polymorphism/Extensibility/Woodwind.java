package org.uengine.chap06.Polymorphism.Extensibility;

public class Woodwind extends Wind {
	@Override void play(Note n) {System.out.println("Woodwind.play() " + n);}
	@Override String what() {return "Woodwind";}
}
