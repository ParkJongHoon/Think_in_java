package org.uengine.Chap08.Inner_Classes.Why_inner_classes;

public class MultiInterfaces {
	static void takeA(A a){}
	static void takeB(B b){}
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takeA(x);
		takeA(y);
		takeB(x);
		takeB(y.makeB());
	}

}
