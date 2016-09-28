package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class LowPass extends Filter {
	double cutoff;
	public LowPass(double cutoff){this.cutoff = cutoff;}
	public Waveform Process(Waveform input){
		return input;
	}
}
