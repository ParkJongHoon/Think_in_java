package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Arrays;


/**
 * 작성일: 2016-12-10
 * 작성자: 박종훈
 * 설명: Iterable 타입 foreach문 사용
 * Iterabel 안에 들어가는 타입은 따로 정해져 있지 않다.
 * 다만 값을 삽입할때 인자값으로는 Arrays.asList() 메소드로 사용하며
 * 삽입하고자하는 값의 배열은 Arrays.asList() 괄호안에 넣는다.
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
