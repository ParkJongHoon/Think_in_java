package org.uengine.Chap09.Holding_Your_Objects.Adding_groups_of_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {

	/**
	 * Arrays.asList() 사용시 주의점
	 * List<Snow> snow1 = Arrays.asList(객체, 객체...);
	 * asList()안에 객체가 들어갈때 Snow 클랙스거나 Snow를 바로 상속받은 객체 만 가능함
	 * 만약 Snow를 상속받은 객체의 상속받은 객체가 들어갈 시에 인식을 하지 못하여 오류가 남
	 * Snow 타입은 인식하지만 Powder 타입은 인식하지 못함 그래서
	 * 이런 경우  ArrayList<Snow>객체를 하나 생성한 다음
	 * Collections.addAll()객체의 인자값으로 ArrayList를 첫번째 변수값으로 주고
	 * 나머지 Snow를 상속받은 아들 또는 손자클래스를 넣으면 가능하다
	 * 다른 방법으로는 Arrays.asList를 사용시
	 * asList앞에 <클래스 타입>을 선언하면된다.
	 * -> Arrays.<Snow>asList()
	 * @param args
	 */
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
				
		// Won't compile:
		// List<Snow> snow2 = Arrays.asList(
		// new Light(), new Heavy());
		// Compiler says:
		// found : java.util.List<Powder>
		// required: java.util.List<Snow>
		// Collections. addAll() doesn't get confused:
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy(), new Crusty(), new Slush(), new Powder());
		
		
		// Give a hint using an
		// explicit type argument specification:
		List<Snow> snow4 = Arrays.<Snow>asList(new Crusty(), new Slush(), new Powder(), new Light(), new Heavy());

		
		System.out.println("-------------snow1---------------");
		System.out.println("snow1.size(): " + snow1.size());
		int count =0;
		for(Snow s: snow1){
			count ++;
			System.out.println( count + "번째 객체: " + s.toString());
		}
		System.out.println("-------------/snow1---------------");
		System.out.println();
		System.out.println("-------------snow3---------------");
		System.out.println("snow3.size(): " + snow3.size());
		count =0;
		for(Snow s: snow3){
			count ++;
			System.out.println( count + "번째 객체: " + s.toString());
		}
		System.out.println("-------------/snow3---------------");
		System.out.println();
		System.out.println("-------------snow4---------------");
		System.out.println("snow4.size(): " + snow4.size());
		count =0;
		for(Snow s: snow4){
			count ++;
			System.out.println( count + "번째 객체: " + s.toString());
		}
		System.out.println("-------------/snow4---------------");
	}

}
