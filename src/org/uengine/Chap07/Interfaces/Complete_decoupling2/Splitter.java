package org.uengine.Chap07.Interfaces.Complete_decoupling2;

import java.util.Arrays;

public class Splitter extends StringProcessor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}

}
