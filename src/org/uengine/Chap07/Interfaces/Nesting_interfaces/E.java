package org.uengine.Chap07.Interfaces.Nesting_interfaces;

public interface E {
	interface G{
		void f();
	}
	public interface H{
		void f();
	}
	void g();
	// Cannot be private within an interface;
	//! private interface I();
}
