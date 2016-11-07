package org.uengine.Chap08.Inner_Classes.Classes_inside_interfaces;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface{
		public void howdy(){
			System.out.println("Howdy!");
		}
		public static void main(String[] args){
			new Test().howdy();
		}
	}
}
