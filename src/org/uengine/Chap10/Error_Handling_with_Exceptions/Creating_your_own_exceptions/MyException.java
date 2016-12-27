package org.uengine.Chap10.Error_Handling_with_Exceptions.Creating_your_own_exceptions;

public class MyException extends Exception {
	public MyException(){}
	public MyException(String msg){super(msg);}
}
