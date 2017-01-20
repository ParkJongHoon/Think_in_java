package org.uengine.Chap10.Error_Handling_with_Exceptions.Constructors;

public class NeedsCleanup {
	private static long counter = 1;
	private final long id = counter++;
	public void dispose(){
		System.out.println("NeedsCleanup " + id + " disposed");
	}
}
