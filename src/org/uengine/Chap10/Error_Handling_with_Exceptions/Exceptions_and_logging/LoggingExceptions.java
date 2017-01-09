package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

public class LoggingExceptions {

	public static void main(String[] args) {
		try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught " + e);
		}
		try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught " + e);
		}

	}

}
