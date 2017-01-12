package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;

/**
 * �ۼ���: 2017-01-12
 * �ۼ���: ������
 * �ۼ�����: OnOffSwitch Ŭ������ ���� ���������� finally�� ����
 * sw.off()�� �־���.
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
