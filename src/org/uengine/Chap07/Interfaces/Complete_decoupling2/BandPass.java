package org.uengine.Chap07.Interfaces.Complete_decoupling2;

public class BandPass extends Filter {
	double lowCutoff, highCutoff;
	public BandPass(double lowCut, double highCut){
		lowCutoff = lowCut;
	}
	public Waveform process(Waveform input){return input;}
}
