package org.uengine.chap03.Initialization_Cleanup.Explicit_static_initializtion;


public class Cups {
	static Cup cup1;
	static Cup cup2;
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("Cups()");
	}
}
