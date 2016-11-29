package org.uengine.Chap09.Holding_Your_Objects.Map;

import java.util.*;

public class Statistics {
	/**
	 * key와 value를 이용한 예제
	 * 1. Random api를 이용하여 0~19까지 value값을 배정받는다(10000번)
	 * 2. 이때 해당 value값을 이용하여 map에서 해당 값을 추출한다.
	 * 3. 물론 등록되어 있지 않은 값이므로 null을 배정받는다.
	 * 4. m.put식을 보면 m.put(r, freq == null? 1: freq + 1);
	 * 식에서 m에 해당 키를  value값으로 등록하고 value값을 value가 null인 
	 * Integer로 입력하므로 Integer 자체에는 1의 value값으로 들어가게 된다.
	 * 그리고 다음 해당 값이 동일하게 배정할 때 Integer의 value값이 1씩 증가하게 된다.
	 * 5. 이를 증명하기 위해서 m안에 있는 각 키의 값으로 Integer를 추출하여 해당 value
	 * 값을 sum으로 더하게 되면 10000번이라는 결과가 나온다.
	 * 
	 * 
	 * 주목해야 할 메소드: 	m.put(r,  freq == null? 1: freq + 1);
	 * @param args
	 */
	public static void main(String[] args){
		Random rand = new Random(47);
		Map<Integer, Integer> m =
				new HashMap<Integer, Integer>();
		
		int index = 0;
		int sum =0;
		for(int i =0; i < 10000; i++){
			// Produce a number  between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r,  freq == null? 1: freq + 1);
			index = i;
		}
		
		System.out.println(m);
		for(int j =0; j<m.size(); j++){
		Integer container =	m.get(j);
		sum = sum + container.intValue();
		}
		System.out.println("sum: " +sum);
	}
}
