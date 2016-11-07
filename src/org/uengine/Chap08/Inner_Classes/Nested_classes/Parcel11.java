package org.uengine.Chap08.Inner_Classes.Nested_classes;

import org.uengine.Chap08.Inner_Classes.Inner_classes_and_upcasting.Contents;
import org.uengine.Chap08.Inner_Classes.Inner_classes_in_methods_and_scopes.Destination;

public class Parcel11 {
	private static class ParcelContents implements Contents{
		private int i = 11;
		public ParcelContents() {
			System.out.println(value());
		}
		public int value(){return i;}
	}
	protected static class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
			System.out.println(label);
		}
		@Override
		public String readLabel() {return label;}
		public static void f(){}
		static int x = 10;
		static class AnotherLevel{
			public static void f(){}
			static int x = 10;
		}
		
	}
	public static Destination destination(String s){
		return new ParcelDestination(s);
	}
	public static Contents contents(){
		return new ParcelContents();
	}
	public static void main(String[] args){
		Contents c = contents();
		Destination d = destination("Tasmania");
	}
}
