package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

public class MyException2 extends Exception {
	/*
	 * 작성일: 2017-01-09
	 * 작성자: 박종훈
	 * 작성내용: Exception 정의 후 사용하는 방법 
	 * 연결되는 Class: ExtraFeatures.class 함께 보기를!!!
	 */
	
	private int x;
	public MyException2(){}
	public MyException2(String msg){ super(msg); }
	public MyException2(String msg, int x){
		super(msg);
		this.x = x;
	}
	public int val(){return x;}
	public String getMessage(){
		return "Detail Message: " + x + " " + super.getMessage();
	}
}

