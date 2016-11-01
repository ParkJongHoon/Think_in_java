package org.uengine.Chap08.Inner_Classes.Anonymous_inner_class;

import org.uengine.Chap08.Inner_Classes.Inner_classes_and_upcasting.Contents;

public class Parcel7 {
	public Contents contents(){
		return new Contents(){
			private int i = 11;
			public int value(){return i;}
		}; // Semicolon required in this case
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.toString());
	}
}
