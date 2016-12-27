package org.uengine.Chap10.Error_Handling_with_Exceptions.Creating_your_own_exceptions;

public class InheritingExceptions {
	
	/**
	 * 작성일: 2016-12-27
	 * 작성자: 박종훈
	 * 내용: try문에서 SimpleException을 catch에서 사용하기 위해서는
	 * 		 try문 안에서 사용하는 메소드 정의시 throws SimpleException을
	 *  	 같이 정의해야 사용할 수 있다. 
	 *   	 throw new SimpleException()은 try{..}catch(SimpleException e)에서
	 *       catch문에 잡혀있는 내용을 강제로 실행 할 수 있게 한다. 
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
