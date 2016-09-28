package org.uengine.chap06.Polymorphism.Inheritance_and_cleanup;

public class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	public LivingCreature() {
		System.out.println("LivingCreature()");
	}
	protected void sidpose(){
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}
