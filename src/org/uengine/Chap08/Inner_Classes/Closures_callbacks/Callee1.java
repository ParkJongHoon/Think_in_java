package org.uengine.Chap08.Inner_Classes.Closures_callbacks;

public class Callee1 implements Incrementable {
	private int i = 0;
	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}

}
