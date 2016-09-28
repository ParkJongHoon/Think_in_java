package org.uengine.chap06.Polymorphism.Inheritance_and_cleanup;

public class Composing {
	private Shared shard;
	private static long counter =0;
	private final long id = counter++;
	public Composing(Shared shared){
		System.out.println("Creating " + this);
		this.shard = shared;
		this.shard.addRef();
	}
	protected void dispose(){
		System.out.println("disposing " + this);
		shard.dispose();
	}
	
	public String toString(){ return "Composing " + id; }

}
