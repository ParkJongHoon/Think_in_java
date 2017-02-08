package org.uengine.Chap11.Strings.The_Formatter_class;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * �ۼ���: 2017-02-08
 * �ۼ���: ������
 * �ۼ�����: Formatter ���� System.out�� �̿��ϴ� ���
 * 			1) Formatter�� System.out�� �����Ѵ�.
 * 			2) Formatter.format���� ǥ���� ������ �ۼ��Ѵ�.
 * 			3) Formatter.format�ȿ��� ������ ����.
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
