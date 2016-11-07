package org.uengine.Chap08.Inner_Classes.Classes_inside_interfaces;

public class TestBed {
	public void f(){System.out.println("f()");}
	public static class Tester{
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}


}
