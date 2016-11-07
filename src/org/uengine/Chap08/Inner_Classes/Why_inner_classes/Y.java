package org.uengine.Chap08.Inner_Classes.Why_inner_classes;

public class Y implements A {
	B makeB(){
		// Anonymous inner class;
		return new B(){};
	}
}
