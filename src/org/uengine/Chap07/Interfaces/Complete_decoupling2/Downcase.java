package org.uengine.Chap07.Interfaces.Complete_decoupling2;

public class Downcase extends StringProcessor {

	@Override
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}

}
