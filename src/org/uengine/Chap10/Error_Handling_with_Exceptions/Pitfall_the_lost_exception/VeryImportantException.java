package org.uengine.Chap10.Error_Handling_with_Exceptions.Pitfall_the_lost_exception;

public class VeryImportantException extends Exception {
	public String toString(){
		return "A trivial exception";
	}
}
