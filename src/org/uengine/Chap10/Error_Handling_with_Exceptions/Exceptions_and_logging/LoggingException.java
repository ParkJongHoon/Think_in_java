package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException extends Exception {
	/*
	 * �ۼ���: 2017-01-09
	 * �ۼ���: ������
	 * �ۼ�����: Logger.getLogger("Exception�̸�")�� �����ϸ�
	 * Exception �̸��� �ش��ϴ� Exception Ŭ������ Constructor�� �о
	 * Logger ��ü�� �����Ѵ�.
	 * Logger Ŭ���� �� �� �״�� Logger�� ����� Ŭ������ ���ϰ�
	 * log�� ���� �������� 
	 * SEVERE(�ɰ�), WARNNING(���), INFO(����),  <- ������� �����α�, ���� �α�, �������� 
	 * CONFIG, FINE, FINER, FINEST <- ���¿� ���� ����� ����
	 */
	private static Logger logger =
			Logger.getLogger("LoggingException");
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace)); // <- ������� �α� �� �غ� ��
		logger.info(trace.toString()); // <- � �α׸� �� ���� ������
	}
}
