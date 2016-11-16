package org.uengine.Chap09.Holding_Your_Objects.Generics_and_type_safe_containers;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		// ArrayList에  집어 넣을 객체 형태 결정
		ArrayList<Apple> apples = new ArrayList<Apple>();
		// ArrayList에  객체 삽입
		for(int i =0; i < 3; i++)
			apples.add(new Apple());
		
		// ArrayList에서 값추출 방법 두가지
		// 1. 일반 for문
		for(int i =0; i< apples.size(); i++)
			System.out.println(apples.get(i).id());
		// 2. forEach문
		for(Apple c : apples)
			System.out.println(c.id());

	}

}
