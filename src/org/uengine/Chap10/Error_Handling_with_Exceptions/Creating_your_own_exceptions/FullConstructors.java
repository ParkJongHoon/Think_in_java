package org.uengine.Chap10.Error_Handling_with_Exceptions.Creating_your_own_exceptions;

public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException();
	}
	public static void main(String[] args) {
		try{
			f();
		}catch(MyException e){
			// e.printStackTrace() ���ڰ� �ȿ� System.out�̶�� �ϸ� 
			// �ش� Exception �α׸�  System.out���� �α׷� ���
			// e.printStackTrace()�� �׳� �����ϸ� System.err��
			// �α׸� ������ �����α׸� ��´�.
			e.printStackTrace();
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
		System.out.println("test");
	}

}
