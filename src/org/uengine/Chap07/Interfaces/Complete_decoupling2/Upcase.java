package org.uengine.Chap07.Interfaces.Complete_decoupling2;

public class Upcase extends StringProcessor {

	@Override
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}

}
