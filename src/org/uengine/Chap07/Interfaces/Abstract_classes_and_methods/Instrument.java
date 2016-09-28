package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

abstract public class Instrument {
	private int i;
	public abstract void play(Note n);
	public String what() {return "Instrument";}
	public abstract void adjust();
}
