package org.uengine.Chap07.Interfaces.Complete_decoupling;

public class Upcase extends Processor {
	String process(Object input){return ((String)input).toUpperCase();}
}
