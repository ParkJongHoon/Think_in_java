package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

	/* �ۼ���: 2017-01-09
	 * �ۼ���: ������
	 * �ۼ�����: Ư�� Exception�� �߻��� �� catch���� 
	 * ������ Exception �߻��ϴ� ����
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
