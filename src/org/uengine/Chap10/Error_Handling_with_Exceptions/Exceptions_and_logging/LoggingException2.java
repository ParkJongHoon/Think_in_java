package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

	/* 작성일: 2017-01-09
	 * 작성자: 박종훈
	 * 작성내용: 특정 Exception이 발생할 때 catch에서 
	 * 정의한 Exception 발생하는 로직
	 * 
	 */
public class LoggingException2 {
	
	private static Logger logger =
			Logger.getLogger("LoggingException2");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args){
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			logException(e);
		}
	}

}
