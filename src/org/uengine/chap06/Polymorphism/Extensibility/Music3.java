package org.uengine.chap06.Polymorphism.Extensibility;

import java.util.Random;

public class Music3 {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
		//System.out.println(i.what());
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i : e){
			tune(i);
		}
	}
	
	public static void randomTune(Instrument[] orchestra){
		Random rand = new Random(47);
	
		int randInt = rand.nextInt(orchestra.length);	
		switch(randInt){
			default:
			case 0: tune(orchestra[0]); break;
			case 1: tune(orchestra[1]); break;
			case 2: tune(orchestra[2]); break;
			case 3: tune(orchestra[3]); break;
			case 4: tune(orchestra[4]); break;
			}
	
	}
	
	public static void main(String[] args){
		Instrument[] orchestra = {
				new Wind(),
				new Percusion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		//tuneAll(orchestra);
		randomTune(orchestra);
		
	}
}
