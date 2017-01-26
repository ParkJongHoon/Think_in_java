package org.uengine.Chap10.Error_Handling_with_Exceptions.Passing_exceptions_to_the_console;

import java.io.FileInputStream;
import java.io.IOException;

	/**
	 * 작성일: 2017-01-26
	 * 작성자: 박종훈
	 * 작성내용: Exception 선언은 main 밖에서 해야한다.
	 *
	 */
public class MainException {
	// Pass all exceptions to the console:
	public static void main(String[] args) throws IOException {
		// Open the file:
		FileInputStream file = new FileInputStream("MainException.java");
		// Use the file ...
		// Close the file:
		file.close();

	}

}
