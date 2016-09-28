package org.uengine.chap06.Polymorphism.Behavior_of_polymorphic_methods_inside_constructors;

public class Glyph {
	void draw(){ System.out.println("Glyph.draw()");}
	Glyph(){System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
