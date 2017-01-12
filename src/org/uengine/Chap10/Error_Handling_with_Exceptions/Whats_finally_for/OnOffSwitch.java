package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;

/**
 * 작성일: 2017-01-12
 * 작성자: 박종훈
 * 작성내용: Switch에서 클래스 구현한 내용을 load후 
 * 실행/정지 했을 때 로그에 해당내용 찍기
 * 
 * 해당 클래스에서 (불편한점/보기에 별로인 부분) -> try안에서 off()하는거
 * 보통 off()는 해당 내용이 마칠때 반드시하는 내용에 설정하는 것이
 * 좋은 코드라는 것을 보여주기 위해서 일부러 try에 넣은 내용
 *
 */

public class OnOffSwitch {
	private static Switch sw = new Switch();
	public static void f() throws OnOffException1, OnOffException2{}
	public static void main(String[] args) {
		try{
			sw.on();
			// Code that can throw exceptions...
			f();
			sw.off();
		}catch(OnOffException1 e){
			System.out.println("OnOffException1");
			sw.off();
		}catch(OnOffException2 e){
			System.out.println("OnOffException2");
			sw.off();
		}

	}

}
