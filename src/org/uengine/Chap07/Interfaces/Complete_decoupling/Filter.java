package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class Filter {
	public String name(){return getClass().getSimpleName();}
	public Waveform process(Waveform input){return input;}
}
