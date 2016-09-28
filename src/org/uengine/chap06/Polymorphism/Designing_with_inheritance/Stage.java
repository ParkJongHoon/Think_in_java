package org.uengine.chap06.Polymorphism.Designing_with_inheritance;

public class Stage {
	private Actor actor = new HappyActor();
	public void change() {actor = new SadActor(); }
	public void performaPlay(){actor.act();}
}
