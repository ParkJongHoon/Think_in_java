package org.uengine.Chap07.Interfaces.Interfaces;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Music5 {
	
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e){
		for(Instrument i: e)
			tune(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
				};
		tuneAll(orchestra);
	}

}
