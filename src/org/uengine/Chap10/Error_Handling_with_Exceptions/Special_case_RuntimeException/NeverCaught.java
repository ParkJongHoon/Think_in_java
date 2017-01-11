package org.uengine.Chap10.Error_Handling_with_Exceptions.Special_case_RuntimeException;

public class NeverCaught {
	static void f(){
		throw new RuntimeException("From f()");
	}
	static void g(){
		f();
	}

	public static void main(String[] args) {
		g();
	}

}
