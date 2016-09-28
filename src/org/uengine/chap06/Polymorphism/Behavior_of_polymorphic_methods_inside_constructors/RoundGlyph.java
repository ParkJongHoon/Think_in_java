package org.uengine.chap06.Polymorphism.Behavior_of_polymorphic_methods_inside_constructors;

public class RoundGlyph extends Glyph {
	public int radius = 1;
	private String rad;
	public RoundGlyph(int  r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	void draw(){
		System.out.println("RoundGlyph.draw(), radius = " + rad);
	}

}
