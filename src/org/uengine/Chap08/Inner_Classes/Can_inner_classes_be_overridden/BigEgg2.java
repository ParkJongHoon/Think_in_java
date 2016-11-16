package org.uengine.Chap08.Inner_Classes.Can_inner_classes_be_overridden;

public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk{
		public Yolk(){System.out.println("BigEgg2.Yolk()");}
		public void f(){System.out.println("BigEgg2.Yolk.f()");}
	}
	public BigEgg2(){insertYolk(new Yolk());}
	public static void main(String[] args){
		Egg2 e2 = new BigEgg2();
		e2.g();
	}
}
