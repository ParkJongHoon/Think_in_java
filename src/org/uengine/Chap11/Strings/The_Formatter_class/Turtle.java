package org.uengine.Chap11.Strings.The_Formatter_class;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * 작성일: 2017-02-08
 * 작성자: 박종훈
 * 작성내용: Formatter 사용시 System.out을 이용하는 방법
 * 			1) Formatter에 System.out을 장착한다.
 * 			2) Formatter.format으로 표현할 내용을 작성한다.
 * 			3) Formatter.format안에는 문법이 들어간다.
 * @author XNote
 *
 */
public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name, Formatter f){
		this.name = name;
		this.f =f;
	}
	public void move(int x, int y){
		f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
	}
	public static void main(String[] args){
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy",
				new Formatter(System.out));
		Turtle terry = new Turtle("Terry",
				new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
		
	}

}
