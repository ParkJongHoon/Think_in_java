package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;
import static net.mindview.util.Print.*;
/**
 * �ۼ���: 2017-01-12
 * �ۼ���: ������
 * �ۼ�����: on() �������� �� �������� state�� true,
 * off() ���������� �������� state�� false�� ����
 * print(this)���� �� toString()�����
 *
 */

public class Switch {
	private boolean state = false;
	public boolean read(){return state;}
	public void on(){state = true; print(this);}
	public void off(){state = false; print(this);}
	public String toString(){return state? "on": "off";}

}
