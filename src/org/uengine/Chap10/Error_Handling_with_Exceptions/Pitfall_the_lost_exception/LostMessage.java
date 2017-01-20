package org.uengine.Chap10.Error_Handling_with_Exceptions.Pitfall_the_lost_exception;

/**
 * 작성일: 2017-01-13
 * 작성자: 박종훈
 * 작성내용: try-finally에 있는 Exception이 발생할 때 finally안에
 * 있는 Exception이 try안에 있는 Exception을 대체 할 수 있다.
 *
 */
public class LostMessage {
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}

	public static void main(String[] args) {
		try{
			LostMessage lm = new LostMessage();
			try{
				lm.f();
			}finally{
				lm.dispose();
			}
		}catch(Exception e){
			System.out.println(e);			
		}

	}

}
