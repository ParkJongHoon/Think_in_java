package org.uengine.Chap11.Strings.Reqular_expressions;
import static net.mindview.util.Print.*;

/**
 * 
 * �ۼ���: 2017-03-22
 * �ۼ���: ������
 * �ۼ�����: ����ǥ������ �̿��� ���ڹٲٱ� ���
 *
 */

public class Replacing {
	static String s = Splitting.knights;
	public static void main(String[] args){
		print(s.replaceFirst("f\\w+", "located"));
		print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
