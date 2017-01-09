package org.uengine.Chap10.Error_Handling_with_Exceptions.Exceptions_and_logging;

public class MyException2 extends Exception {
	/*
	 * �ۼ���: 2017-01-09
	 * �ۼ���: ������
	 * �ۼ�����: Exception ���� �� ����ϴ� ��� 
	 * ����Ǵ� Class: ExtraFeatures.class �Բ� ���⸦!!!
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

