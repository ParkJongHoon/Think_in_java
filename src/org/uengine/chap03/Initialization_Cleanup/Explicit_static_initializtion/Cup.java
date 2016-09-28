package org.uengine.chap03.Initialization_Cleanup.Explicit_static_initializtion;

public class Cup {
	Cup(int marker){
		System.out.println("Cup(" + marker + ")");
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}

}
