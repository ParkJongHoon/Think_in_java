package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Music4 {
	
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e){
		for(Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = {new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()};
		tuneAll(orchestra);

	}

}
