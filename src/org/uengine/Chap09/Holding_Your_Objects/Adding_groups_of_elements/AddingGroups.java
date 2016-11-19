package org.uengine.Chap09.Holding_Your_Objects.Adding_groups_of_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	/**
	 * Arrays, Collections -> java.util안에 있는 객체의 그룹을 더하는 Collection
	 * Arrays 경우 Arrays.asList()로  객체의 묶음을 더하는 메소드가 있음(static 형태라고 추정)
	 * Arrays.asList() 괄호안에 들어갈 변수들은 각각을 ',' 로 구분하여 저장됨(','가  token 역할을 함)
	 * Collections.addAll()안에 들어가는 변수값은 콜렉션 객체와 기타 객체의 리스트로 넣을 수 있다. 아래코드 참조
	 * Arrays.asList()는 List객체에서도 사용가능하며 단 collection과 다르게
	 * List를 변수 선언 후(객체 선언하지 않은 상태) List변수에 넣을 수 있고 출력도 가능하다 
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = {6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // Ok -- modify an element
		// list.add(21); // Runtime error because the
						// underlying array cannot be resized.
		
		
		System.out.println("-------------collection------------------");
		System.out.println("collection의 사이즈: " + collection.size());
		int counter = 0;
		for(Integer i: collection){
			counter++;
			System.out.print(counter + "번째:");
			System.out.println(i);
		}
		counter = 0;
		System.out.println("-------------/collection------------------");
		System.out.println();
		System.out.println("list의 사이즈: " + list.size());
		System.out.println("-------------list------------------");
		for(Integer i: list){
			counter++;
			System.out.print(counter + "번째:");
			System.out.println(i);
		}
		System.out.println("-------------/list------------------");
		

	}

}
