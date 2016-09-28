package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Percussion extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public String what(){return "Percussion";}
	
	@Override
	public void adjust() {}

}
