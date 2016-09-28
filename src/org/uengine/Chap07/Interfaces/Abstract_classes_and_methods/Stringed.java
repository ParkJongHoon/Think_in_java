package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Stringed extends Instrument {

	@Override
	public void play(Note n) {
	System.out.println("Stringed.play() " + n);
	}
	public String what(){return "Stringed" ;}

	@Override
	public void adjust() {}

}
