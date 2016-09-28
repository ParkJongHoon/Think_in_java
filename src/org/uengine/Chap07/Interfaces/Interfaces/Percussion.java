package org.uengine.Chap07.Interfaces.Interfaces;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Percussion implements Instrument {

	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);

	}

	public String toString(){return "Percussion";}

	@Override
	public void adjust() {System.out.println(this + ".adjust()");}

}
