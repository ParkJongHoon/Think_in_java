package org.uengine.Chap09.Holding_Your_Objects.The_Adapter_Method_idiom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 * �ۼ���: ������
 * �ۼ���: 2016-12-22
 * ����: list1�� list2�� ���̿� ���� ����
 * list1�� Integer �迭 ia�� ArrayList ��ü�� ������
 * �迭 ���� �����Ͽ� �ִ� ���� �̹Ƿ�
 * Collectins.shuffle �޼ҵ带 �̿��Ͽ� ������ �ٲپ
 * ���� ia�� �迭 ������ ������ ���� �ʴ´�.
 * �׷��� list2�� ��� ia ��ü�� Arrays.asList�� �̿��Ͽ�
 * �ٷ� ia ��ü�� �����ϹǷ�  Collections.shuffle �޼ҵ带
 * ����ϸ� �ٷ� ������ �ٲ��. (������ ���ڸ� ArrayList�� �����Ͽ�
 * �����ϴ� �Ͱ� �׷��� ���� �Ϳ� ���� ����, ������ ���纻)
 *
 */
public class ModifyingArraysAsList {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list1 =
				new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("Before shuffling: " + list1);
		arraysPrint(list1);
		Collections.shuffle(list1, rand);
		System.out.println("After shuffling: " + list1);
		arraysPrint(list1);
		System.out.println("array: " + Arrays.toString(ia));
		
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("Before shuffling: " + list2);
		arraysPrint(list2);
		Collections.shuffle(list2, rand);
		System.out.println("After shuffling: " + list2);
		arraysPrint(list2);
		System.out.println("array: " + Arrays.toString(ia));
	}
	
	
	public static void arraysPrint(List<Integer> list){
		int counter = 0;
		for(int n : list){
			System.out.print(n);
			if(counter < list.size()-1){
				System.out.print(", ");
			}
			counter++;
		}
		System.out.println();
	}

}
