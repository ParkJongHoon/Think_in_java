package org.uengine.Chap08.Inner_Classes.Anonymous_inner_class;

import org.uengine.Chap08.Inner_Classes.Inner_classes_in_methods_and_scopes.Destination;




public class Parcel9 {
	public Destination destination(final String dest){
		return new Destination(){
			private String label = dest;
			public String readLabel(){return label;}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");

	}

}
