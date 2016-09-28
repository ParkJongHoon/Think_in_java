package org.uengine.chap03.Initialization_Cleanup.Enumerated_types;

public class EnumOrder {

	public static void main(String[] args) {
		for(Spiciness s : Spiciness.values()){
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}

}
