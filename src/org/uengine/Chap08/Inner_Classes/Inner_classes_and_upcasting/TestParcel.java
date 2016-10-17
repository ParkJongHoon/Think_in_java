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
		 *  class안에 있는 클래스를 객체로 아래 와 같은 방법으로는 객체를 생성할 수 없다.
		 *	클래스 명부터가 선언이 불가능하다 그래서 인터페이스를 implements하고 
		 *	implements한 클래스 이름으로 클래스를 상속한다.
		 *	해당 객체를 넘겨받는 방식은 리턴방식이 해당 인터페이스의 이름으로 하여 객체를 전달받는다.
		 * 
		 */
		
		

	}

}
