package org.uengine.chap03.Initialization_Cleanup.Nonstatic_instance_initialization;

class Mug {
	public Mug(int marker) {
		System.out.println("Meg(" + marker + ")");
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
		
	}
}
