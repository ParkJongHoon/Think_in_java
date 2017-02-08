package org.uengine.Chap11.Strings.Unintended_recursion;

import java.util.ArrayList;

import org.uengine.temp.Coffee;
import org.uengine.temp.CoffeeGenerator;


/**
 * 작성일: 2017-02-08
 * 작성자: 박종훈
 * 작성내용: toString의 사용예제
 *           ->System.out.println() 안에 
 *           객체를 넣으면 동적으로 toString()이 발생
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
