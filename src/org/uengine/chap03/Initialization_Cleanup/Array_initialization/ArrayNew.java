package org.uengine.chap03.Initialization_Cleanup.Array_initialization;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args){
		int[] a;
		Random rand = new Random(47);
		 a = new int[rand.nextInt(20)]; //a = new int[?];
		
		System.out.println("length of a = " + a.length);
		System.out.println(a.toString()); // a의 reference의 위치를 toString
		System.out.println(Arrays.toString(a)); // Array a안에 담긴 값들을 toString 
		/* 1. Array 객체를 사용 할 때는 반드시 Array객체의 크기를 설정해주어야 한다.
		 * 2. 본 예제에서 말하고자 하는 것은 Array의 배열 크기 설정값을 모른다고 할지라도
		 * Array객체.length()를 사용하면 Array객체의 크기를 알수 있다.
		 * 
		 */
	}

}
