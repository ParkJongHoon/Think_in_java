package org.uengine.chap03.Initialization_Cleanup.Array_initialization;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args){
		int[] a;
		Random rand = new Random(47);
		 a = new int[rand.nextInt(20)]; //a = new int[?];
		
		System.out.println("length of a = " + a.length);
		System.out.println(a.toString()); // a�� reference�� ��ġ�� toString
		System.out.println(Arrays.toString(a)); // Array a�ȿ� ��� ������ toString 
		/* 1. Array ��ü�� ��� �� ���� �ݵ�� Array��ü�� ũ�⸦ �������־�� �Ѵ�.
		 * 2. �� �������� ���ϰ��� �ϴ� ���� Array�� �迭 ũ�� �������� �𸥴ٰ� ������
		 * Array��ü.length()�� ����ϸ� Array��ü�� ũ�⸦ �˼� �ִ�.
		 * 
		 */
	}

}
