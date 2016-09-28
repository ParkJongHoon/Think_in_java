package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class BandPass extends Filter {
	double lowCutoff, highCutoff;
	public BandPass(double lowCut, double highCut){
		lowCutoff = lowCut;
		
	}
}
