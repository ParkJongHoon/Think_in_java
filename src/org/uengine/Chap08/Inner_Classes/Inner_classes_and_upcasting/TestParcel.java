package org.uengine.Chap08.Inner_Classes.Inner_classes_and_upcasting;


public class TestParcel {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		System.out.println(d.readlabel());
		// Illegal -- can't access private class;
		//! Parcel4.PContents pc = p.new PContents();
		/**
		 * 
		 *  class�ȿ� �ִ� Ŭ������ ��ü�� �Ʒ� �� ���� ������δ� ��ü�� ������ �� ����.
		 *	Ŭ���� ����Ͱ� ������ �Ұ����ϴ� �׷��� �������̽��� implements�ϰ� 
		 *	implements�� Ŭ���� �̸����� Ŭ������ ����Ѵ�.
		 *	�ش� ��ü�� �Ѱܹ޴� ����� ���Ϲ���� �ش� �������̽��� �̸����� �Ͽ� ��ü�� ���޹޴´�.
		 * 
		 */
		
		

	}

}
