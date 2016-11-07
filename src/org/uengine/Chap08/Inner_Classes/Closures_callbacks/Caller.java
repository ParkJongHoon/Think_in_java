package org.uengine.Chap08.Inner_Classes.Closures_callbacks;

public class Caller {
	private Incrementable callbackReference;
	Caller(Incrementable cbh){ callbackReference = cbh;}
	void go(){callbackReference.increment();}

}
