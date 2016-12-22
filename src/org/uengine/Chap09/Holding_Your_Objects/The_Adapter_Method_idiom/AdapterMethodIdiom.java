package org.uengine.Chap09.Holding_Your_Objects.The_Adapter_Method_idiom;

import java.util.Arrays;
/**
 * 
 * 작성자: 박종훈
 * 작성일: 2016-12-22
 * 내용: reversed() 실행하는 예제
 * 
 */

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral =
				new ReversibleArrayList<String>(
						Arrays.asList("To be or not to be".split(" ")));
		// Grabs the ordinary iterator via iterator();
		System.out.println(ral);
		for(String s : ral)
			System.out.print(s + " ");
		System.out.println();
		// Hand it the Iterable of your choice
		for(String s: ral.reversed())
			System.out.print(s + " ");

	}

}
