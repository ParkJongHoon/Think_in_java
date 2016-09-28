package org.uengine.chap06.Polymorphism.pitfall_static_method;

public class Sub extends Super {
	public int field = 1;
	public int getField(){return field;}
	public int getsuperField(){return super.field;}
}
