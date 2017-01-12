package org.uengine.Chap10.Error_Handling_with_Exceptions.Whats_finally_for;
import static net.mindview.util.Print.*;

/**
 * 작성일: 2017-01-12
 * 작성자: 박종훈
 * 작성내용: try-catch-finally 상황별 시컨스 속도 보여주는 예제 
 *
 */

public class AlwaysFinally {

	public static void main(String[] args) {
		print("Entering first try block");
		try{
			print("Entering second try block");
			try{
				throw new FourException();
			}finally{
				print("finally in 2nd try block");
			}
		}catch(FourException e){
			System.out.println("Caught FourException in 1st try block");
		}finally{
			System.out.println("finally in 1st try block");
		}

	}

}
