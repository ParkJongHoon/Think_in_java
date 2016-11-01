package org.uengine.Chap08.Inner_Classes.Anonymous_inner_class;

import org.uengine.Chap08.Inner_Classes.Inner_classes_in_methods_and_scopes.Destination;

public class Parcel10 {
	public Destination destination(final String dest, final float price){
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100)
					System.out.println("Over budget!");
			}
			private String label = dest;
			@Override
			public String readLabel() {return label;}
		};
	}
	public static void main(String[] args){
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.395F);
		System.out.println(d.readLabel());
	}

}
