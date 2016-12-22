package org.uengine.Chap09.Holding_Your_Objects.The_Adapter_Method_idiom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 * 작성자: 박종훈
 * 작성일: 2016-12-22
 * 내용: list1과 list2의 차이에 대한 예제
 * list1은 Integer 배열 ia를 ArrayList 객체를 생성후
 * 배열 값을 복사하여 넣는 형태 이므로
 * Collectins.shuffle 메소드를 이용하여 순서를 바꾸어도
 * 원본 ia에 배열 순서는 영향을 받지 않는다.
 * 그러나 list2의 경우 ia 자체를 Arrays.asList를 이용하여
 * 바로 ia 객체를 주입하므로  Collections.shuffle 메소드를
 * 사용하면 바로 순서가 바뀐다. (정리를 하자면 ArrayList를 생성하여
 * 주입하는 것과 그렇지 않은 것에 대한 차이, 원본과 복사본)
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
