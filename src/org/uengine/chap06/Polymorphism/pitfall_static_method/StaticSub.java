package org.uengine.chap06.Polymorphism.pitfall_static_method;

public class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}

}
