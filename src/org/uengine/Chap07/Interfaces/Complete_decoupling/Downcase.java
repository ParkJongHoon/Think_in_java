package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class Downcase extends Processor {
	String process(Object input){return ((String)input).toLowerCase();} 
}
