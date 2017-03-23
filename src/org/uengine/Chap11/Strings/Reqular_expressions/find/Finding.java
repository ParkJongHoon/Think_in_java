package org.uengine.Chap11.Strings.Reqular_expressions.find;

import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * �ۼ���: 2017-03-23
 * �ۼ���: ������
 * �ۼ�����: java.util.regex�� Pattern�� Matcher ���
 * 			- find() �޼ҵ� ���
 *          1) Pattern�� ���� -> Pattern.complie("���ϳ���")
 *          2) Matcher�� ��ü m�� ���ϳ���� matcher()������ ���Խ�Ŵ
 *          3) m.find()�� �ϸ� ���ϳ��뿡 �Էµ� ����� ���� true or false�� �����ʰ� ���ÿ�
 *             m.group()�� ���� ������ 
 * 
 *
 */

public class Finding {

	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+")
				.matcher("Evening is full of the linnet's wings");
		while(m.find())
			printnb(m.group() + " ");
		print();
		int i = 0;
		while(m.find(i)){
			printnb(m.group() + " ");
			System.out.print(i);
			i++;
		}

	}

}
