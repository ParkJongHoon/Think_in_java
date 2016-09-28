package org.uengine.Chap07.Interfaces.Interfaces_and_factories;

public class Implementationa1Factory implements ServiceFactory {

	@Override
	public Service getservice() {
		return new Implementaion1();
	}

}
