package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Map;

public class EnvironmentVariables {

	/**
	 * 작성일: 2016-12-10
	 * 작성자: 박종훈
	 * 설명: 환경변수 key와 value 가지고 와서 결과 보이주는 foreach문
	 * 
	 */
	public static void main(String[] args) {
		for(Map.Entry entry: System.getenv().entrySet()){
			System.out.println(entry.getKey() + ": " +
		entry.getValue());
		}

	}

}
