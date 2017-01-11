package org.uengine.Chap10.Error_Handling_with_Exceptions.Rethrowing_anexception;

/**
 * 작성일: 2017-01-11
 * 작성자: 박종훈
 * 작성내용: stack trace의 시작점 결정하는 코드
 * throw e로 던지면 Exception 시작점 부터 진행되고
 * throw (Exception)e.fillInStackTrace() 로 던지면 현재있던 위치가
 * Exception 시작점으로 지정됨 
 *
 */

public class Rethrowing {
	public static void f() throws Exception{
		System.out.println("originationg the exception in f()");
		throw new Exception("thrown form f()");
	}
	public static void  g() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			// g() 메소드와 h() 메소드의 차이점
			throw e;
		}
	}
	public static void h() throws Exception{
		try{
		f();	
		}catch(Exception e){
			System.out.println("Inside h().e.printStackTrace()");
			e.printStackTrace(System.out);
			// g() 메소드와 h() 메소드의 차이점
			throw (Exception)e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		try{
			g();
		}catch(Exception e){
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		System.out.println();
		System.out.println();
		try{
			h();
		}catch(Exception e){
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}

	}

}
