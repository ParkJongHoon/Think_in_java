package org.uengine.Chap07.Interfaces.Complete_decoupling2;

public abstract class StringProcessor implements Processor {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);
	public static String s = "If she weighs the same as a duck, she's made of wood";
	public static void main(String[] args){
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}

}
