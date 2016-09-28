package org.uengine.chap03.Initialization_Cleanup.Calling_constructors_from_constructors;

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	public Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = "
				+ petalCount);
	}
	public Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}
	public Flower(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("String & int args");
	}
	public Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}
	
	void printPetalCout(){
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args){
		Flower x = new Flower();
		x.printPetalCout();
	}

}
