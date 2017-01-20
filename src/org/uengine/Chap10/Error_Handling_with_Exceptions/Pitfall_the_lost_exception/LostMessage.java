package org.uengine.Chap10.Error_Handling_with_Exceptions.Pitfall_the_lost_exception;

/**
 * �ۼ���: 2017-01-13
 * �ۼ���: ������
 * �ۼ�����: try-finally�� �ִ� Exception�� �߻��� �� finally�ȿ�
 * �ִ� Exception�� try�ȿ� �ִ� Exception�� ��ü �� �� �ִ�.
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
