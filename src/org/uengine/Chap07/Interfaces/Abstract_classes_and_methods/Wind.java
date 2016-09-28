package org.uengine.Chap07.Interfaces.Abstract_classes_and_methods;


import org.uengine.chap06.Polymorphism.Extensibility.Note;

public class Wind extends Instrument {
	public void play(Note n){
		System.out.println("Wind.play() " + n);
	}
	public String what(){return "Wind";}
	
	@Override
	public void adjust() {}
}
