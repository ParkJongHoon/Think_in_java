package org.uengine.chap06.Polymorphism.pitfall_static_method;

public class StaticSuper {
	public static String staticGet(){
		return "Base staticGet()";
	}
	public String dynamicGet(){
		return "Base dynamicGet()";
	}

}
