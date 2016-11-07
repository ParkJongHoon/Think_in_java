package org.uengine.Chap08.Inner_Classes.Reaching_outward_from_a_multiply_nested_class;

public class MultiNestingAccess {

	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
		}
}
