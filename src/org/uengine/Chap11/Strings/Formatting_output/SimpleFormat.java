package org.uengine.Chap11.Strings.Formatting_output;

/**
 * 작성일: 2017-02-08
 * 작성자: 박종훈
 * 작성내용: 간단한 Format 형식에 대한 사용법
 * @author XNote
 *
 */
public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y = 5.332542;
		// The old way:
		System.out.println("Row 1: [" + x + " " + y + "]");
		// The new way:
		System.out.format("Row 1: [%d %f]\n", x, y);
		// or
		System.out.printf("Row 1: [%d %f]\n", x, y);
	}
}
