package org.uengine.Chap11.Strings.Unintended_recursion;

import java.util.ArrayList;

import org.uengine.temp.Coffee;
import org.uengine.temp.CoffeeGenerator;


/**
 * �ۼ���: 2017-02-08
 * �ۼ���: ������
 * �ۼ�����: toString�� ��뿹��
 *           ->System.out.println() �ȿ� 
 *           ��ü�� ������ �������� toString()�� �߻�
 * @author XNote
 *
 */
public class ArrayListDisplay {

	public static void main(String[] args) {
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		for(Coffee c: new CoffeeGenerator(10))
			coffees.add(c);
		System.out.println(coffees);
	}

}
