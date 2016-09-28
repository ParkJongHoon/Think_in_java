package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Brass extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	public String what() {return "Brass" ;}
}
