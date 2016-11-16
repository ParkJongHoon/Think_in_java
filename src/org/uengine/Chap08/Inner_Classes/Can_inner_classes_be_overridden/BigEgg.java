package org.uengine.Chap08.Inner_Classes.Can_inner_classes_be_overridden;

public class BigEgg extends Egg {
	private Yolk y;
	public class Yolk{
		public Yolk(){System.out.println("BigEgg.Yolk()");}
	}
	public static void main(String[] args){
		new BigEgg();
	}
}
