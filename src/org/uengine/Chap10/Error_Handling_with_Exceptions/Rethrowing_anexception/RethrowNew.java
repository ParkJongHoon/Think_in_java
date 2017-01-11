package org.uengine.Chap10.Error_Handling_with_Exceptions.Rethrowing_anexception;

public class RethrowNew {
	public static void f() throws OneException{
		System.out.println("originating the exceptionin f()");
		throw new OneException("thrown form f()");
	}
	public static void main(String[] args){
	try{
		try{
			f();
		}catch(OneException e){
			System.out.println("Caught in inner try, e.printStackTrace()");
			e.printStackTrace(System.out);
			throw new TwoException("from inner try");
			
		}
	 	}catch(TwoException e){
	 		// �� �������� Stack trace �� ���������� ��ϵ�
	 		System.out.println("Caught in outer try, e.printStackTrace()");
	 		e.printStackTrace(System.out);
	 	}
	}
	
}
