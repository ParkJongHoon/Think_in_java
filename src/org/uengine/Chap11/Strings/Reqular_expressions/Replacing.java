package org.uengine.Chap11.Strings.Reqular_expressions;
import static net.mindview.util.Print.*;

/**
 * 
 * 작성일: 2017-03-22
 * 작성자: 박종훈
 * 작성내용: 정규표현식을 이용한 문자바꾸기 방법
 *
 */

public class Replacing {
	static String s = Splitting.knights;
	public static void main(String[] args){
		print(s.replaceFirst("f\\w+", "located"));
		print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
