package org.uengine.Chap07.Interfaces.Interfaces;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Stringed implements Instrument {

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println(this + ".play() " + n);
	}
	public String toString(){return "Stringed";}
	@Override
	public void adjust() {System.out.println(this + ".adjust()");}

}
