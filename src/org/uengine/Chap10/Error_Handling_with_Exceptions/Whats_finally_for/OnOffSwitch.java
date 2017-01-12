package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;

/**
 * �ۼ���: 2017-01-12
 * �ۼ���: ������
 * �ۼ�����: Switch���� Ŭ���� ������ ������ load�� 
 * ����/���� ���� �� �α׿� �ش系�� ���
 * 
 * �ش� Ŭ�������� (��������/���⿡ ������ �κ�) -> try�ȿ��� off()�ϴ°�
 * ���� off()�� �ش� ������ ��ĥ�� �ݵ���ϴ� ���뿡 �����ϴ� ����
 * ���� �ڵ��� ���� �����ֱ� ���ؼ� �Ϻη� try�� ���� ����
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
