package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;

/**
 * 작성일: 2017-01-12
 * 작성자: 박종훈
 * 작성내용: OnOffSwitch 클래스와 같은 내용이지만 finally를 만들어서
 * sw.off()를 넣었다.
 *
 */

public class WithFinally {
	static Switch sw = new Switch();
	public static void main(String[] args) {
		try{
			sw.on();
			// Code that can throw exceptions....
			OnOffSwitch.f();
			
		}catch(OnOffException1 e){
			System.out.println("OnOffException1");
		}catch(OnOffException2 e){
			System.out.println("OnOffException2");
		}finally{
			sw.off();
		}

	}

}
