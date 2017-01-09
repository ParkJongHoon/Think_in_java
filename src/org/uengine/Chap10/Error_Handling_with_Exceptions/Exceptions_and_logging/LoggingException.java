package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException extends Exception {
	/*
	 * 작성일: 2017-01-09
	 * 작성자: 박종훈
	 * 작성내용: Logger.getLogger("Exception이름")을 실행하면
	 * Exception 이름에 해당하는 Exception 클래스의 Constructor을 읽어서
	 * Logger 객체를 생성한다.
	 * Logger 클래스 란 말 그대로 Logger를 남기는 클래스를 말하고
	 * log의 상태 종류에는 
	 * SEVERE(심각), WARNNING(경고), INFO(정보),  <- 순서대로 에러로그, 오류 로그, 정보오류 
	 * CONFIG, FINE, FINER, FINEST <- 상태에 대한 언급이 없음
	 */
	private static Logger logger =
			Logger.getLogger("LoggingException");
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace)); // <- 여기까지 로그 쓸 준비를 함
		logger.info(trace.toString()); // <- 어떤 로그를 쓸 지를 결정함
	}
}
