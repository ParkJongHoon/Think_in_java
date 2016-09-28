package org.uengine.Chap07.Interfaces.Complete_decoupling2;

public class FilterAdapter implements Processor {
	Filter filter;
	public FilterAdapter(Filter filter){this.filter = filter;}

	@Override
	public String name() {return filter.name();}

	@Override
	public Object process(Object input) {
		return filter.process((Waveform)input);
	}

}
