package org.uengine.Chap09.Holding_Your_Objects.Generics_and_type_safe_containers;

public class Apple {
	private static long counter;
	private final long id = counter++;
	public long id(){return id;}
}
