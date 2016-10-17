package org.uengine.Chap08.Inner_Classes.Inner_classes_and_upcasting;


public class Parcel4 {
	private class PContents implements Contents{
		private int i = 11;
		public int value(){return i;}		
	}
	private class PContents2{
		private int i = 11;
		public int value(){return i;}		
	}
	protected class PDestination implements Destination{
		private String label;
		private PDestination(String whereTo){
			label = whereTo;
		}
		public String readlabel2() {
			// TODO Auto-generated method stub
			return label;
		}
		
		@Override
		public String readlabel() {
			// TODO Auto-generated method stub
			return label;
		}
	}
	public Destination destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}

}
