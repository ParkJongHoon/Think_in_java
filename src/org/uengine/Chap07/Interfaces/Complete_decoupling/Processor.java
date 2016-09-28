package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class Processor {
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){return input;}
}
