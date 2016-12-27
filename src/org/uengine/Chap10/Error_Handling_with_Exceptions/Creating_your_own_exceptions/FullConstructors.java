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
			// e.printStackTrace() 인자값 안에 System.out이라고 하면 
			// 해당 Exception 로그를  System.out으로 로그로 찍고
			// e.printStackTrace()를 그냥 실행하면 System.err로
			// 로그를 보내서 오류로그를 찍는다.
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
