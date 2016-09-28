package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;

import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Woodwind extends Wind {
	public void play(Note n){
		System.out.println("Woodwind.play() " + n);
	}
	public String what(){return "Woodwind";}

}
