package org.uengine.Chap09.Holding_Your_Objects.Generics_and_type_safe_containers;

import java.util.ArrayList;

public class AppleAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		/* 아래와 같이 ArrayList를 사용하면 담는 객체타입이 결정되지 않아서
		 * ArrayList객체로 특정 메소드를 실행시키는 코드 삽입시 오류가
		 * 발생할 수 있다는 것을 보여주는 코드
		*/
		ArrayList apples = new ArrayList();
		for(int i =0; i<3; i++)
			apples.add(new Apple());
		//Not prevented from adding an Orange to apples:
		apples.add(new Orange());
		for(int i =0; i< apples.size(); i ++)
			// Orange 형의 객체에서 id라는 메소드가 없는데 실행되어서 에러발생
			System.out.println(((Apple)apples.get(i)).id());
		// Orange is detected only at run time
	}

}
