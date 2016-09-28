package org.uengine.chap03.Initialization_Cleanup.Order_of_initialization;


public class House {
	Window w1 = new Window(1);
	House(){
		System.out.println("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f(){
		System.out.println("f()");
		
	}
	Window w3 = new Window(3);

}
