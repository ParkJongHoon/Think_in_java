package org.uengine.Chap08.Inner_Classes.Anonymous_inner_class;

import org.uengine.Chap08.Inner_Classes.Inner_classes_and_upcasting.Contents;

public class Parcel7b {
	class MyContents implements Contents{
		private int i = 11;
		public int value(){return i;}
	}
	public Contents contents()	{return new MyContents();}
	public static void main(String[] args) {
		Parcel7b p = new Parcel7b();
		Contents c = p.contents();
	}

}
