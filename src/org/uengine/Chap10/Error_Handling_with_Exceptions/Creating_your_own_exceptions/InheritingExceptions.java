package org.uengine.Chap10.Error_Handling_with_Exceptions.Creating_your_own_exceptions;

public class InheritingExceptions {
	
	/**
	 * �ۼ���: 2016-12-27
	 * �ۼ���: ������
	 * ����: try������ SimpleException�� catch���� ����ϱ� ���ؼ���
	 * 		 try�� �ȿ��� ����ϴ� �޼ҵ� ���ǽ� throws SimpleException��
	 *  	 ���� �����ؾ� ����� �� �ִ�. 
	 *   	 throw new SimpleException()�� try{..}catch(SimpleException e)����
	 *       catch���� �����ִ� ������ ������ ���� �� �� �ְ� �Ѵ�. 
	 * @throws SimpleException
	 */
	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try{
			sed.f();
		}catch(SimpleException e){
			System.out.println("Caught it!");
		}

	}

}
