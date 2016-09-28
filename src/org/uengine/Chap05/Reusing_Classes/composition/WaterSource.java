package org.uengine.Chap05.Reusing_Classes.composition;

public class WaterSource {
	private String s;
	public WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed" ;
	}
	public String toString(){ return s;}

}
