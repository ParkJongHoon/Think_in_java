package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Arrays;


/**
 * �ۼ���: 2016-12-10
 * �ۼ���: ������
 * ����: Iterable Ÿ�� foreach�� ���
 * Iterabel �ȿ� ���� Ÿ���� ���� ������ ���� �ʴ�.
 * �ٸ� ���� �����Ҷ� ���ڰ����δ� Arrays.asList() �޼ҵ�� ����ϸ�
 * �����ϰ����ϴ� ���� �迭�� Arrays.asList() ��ȣ�ȿ� �ִ´�.
 * 
 */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib){
		for(T t: ib)
			System.out.print(t + " ");
	}

	public static void main(String[] args) {
	test(Arrays.asList(1, 2, 3));
	String[] strings = {"A", "B", "C"};
	// An array works in foreach, but it's not Iterable:
	//! test(strings);
	// You must explicitly convert it to an Iterable:
	test(Arrays.asList(strings));

	}

}
