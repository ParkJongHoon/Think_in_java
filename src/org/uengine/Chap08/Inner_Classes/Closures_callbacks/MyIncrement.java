package org.uengine.Chap08.Inner_Classes.Closures_callbacks;

public class MyIncrement {
	public void increment(){System.out.println("Other operation");}
	static void f(MyIncrement mi){mi.increment();}
}
