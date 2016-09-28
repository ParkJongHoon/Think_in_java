package org.uengine.Chap07.Interfaces.Interfaces_and_factories;

public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service s = fact.getservice();
		s.method1();
		s.method2();
	}
	public static void main(String[] args) {
		serviceConsumer(new Implementationa1Factory());
		// Implementations are completely interchangeable;
		serviceConsumer(new Implementationa2Factory());
	}

}
