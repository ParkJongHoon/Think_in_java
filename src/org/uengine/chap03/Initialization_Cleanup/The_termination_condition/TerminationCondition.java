package org.uengine.chap03.Initialization_Cleanup.The_termination_condition;


public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();

	}

}
