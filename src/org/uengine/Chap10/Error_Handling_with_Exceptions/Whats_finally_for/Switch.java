package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;
import static net.mindview.util.Print.*;
/**
 * 작성일: 2017-01-12
 * 작성자: 박종훈
 * 작성내용: on() 실행했을 때 전역변수 state가 true,
 * off() 실행했을때 전역변수 state가 false로 지정
 * print(this)했을 때 toString()실행됨
 *
 */

public class Switch {
	private boolean state = false;
	public boolean read(){return state;}
	public void on(){state = true; print(this);}
	public void off(){state = false; print(this);}
	public String toString(){return state? "on": "off";}

}
