package org.uengine.Chap10.Error_Handling_with_Exceptions.Pitfall_the_lost_exception;

public class ExceptionSilencer {
	public static void main(String[] args){
		try{
			throw new RuntimeException();
		}finally{
			// Using 'return' inside the finally block
			// will silence any thrown exception/
			return;
			
		}
	}

}
