package org.uengine.Chap07.Interfaces.Interfaces;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public interface Instrument {
	//Compile-time constant
	int VALUE = 5; // static & final
	// Cannot have method definitions
	void play(Note n);
	void adjust();

}
