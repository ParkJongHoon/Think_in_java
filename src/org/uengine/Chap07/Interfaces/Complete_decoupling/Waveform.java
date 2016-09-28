package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class Waveform {
	private static long counter;
	private final long id = counter++;
	public String toString(){return "Waveform " + id;}
}
