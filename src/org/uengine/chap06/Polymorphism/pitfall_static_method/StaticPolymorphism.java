package org.uengine.chap06.Polymorphism.pitfall_static_method;

public class StaticPolymorphism {

	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}

}
