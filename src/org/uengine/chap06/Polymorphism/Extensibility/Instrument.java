package org.uengine.chap06.Polymorphism.Extensibility;

public class Instrument {
	
	void play(Note n){System.out.println("Instrumnet.play() " + n);}
	String what(){return "Instrument ";}
	void adjust(){System.out.println("Adjusting Instrument");}
}
