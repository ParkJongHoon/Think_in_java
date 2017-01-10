package org.uengine.Chap10.Error_Handling_with_Exceptions.The_stack_trace;

/**
 * 작성일: 2017-01-10
 * 작성자: 박종훈
 * 작성내용: 메소드 사용시 Exception 걸려 있는 메소드 이름을 추적하여 
 * 			 log에 print 할수 있다. 
 *
 */

public class WhoCalled {
	static void f(){
		// Generate an exception to fill in the stack trace
		try{
			throw new Exception();
		}catch(Exception e){
			for(StackTraceElement ste: e.getStackTrace())
				System.out.println(ste.getMethodName());
		}
	}
	static void g(){f();}
	static void h(){g();}

	public static void main(String[] args) {
		f();
		System.out.println("------------------------");
		g();
		System.out.println("------------------------");
		h();
	}

}
