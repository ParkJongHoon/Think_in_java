package org.uengine.Chap10.Error_Handling_with_Exceptions.Using_finally_during_return;
import static net.mindview.util.Print.*;

/**
 * 작성일: 2017-01-12
 * 작성자: 박종훈
 * 작성내용: return과 finally를 적절히 사용한 예제
 */

public class MultipleReturns {
	public static void f(int i){
		print("Initialization that requires cleanup");
		try{
			print("Point 1");
			if(i == 1) return;
			print("Point 2");
			if(i == 2) return;
			print("Point 3");
			if(i == 3) return;
			print("End");
			return;
		}finally{
			print("Performing cleanup");
		}
	}

	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++)
			f(i);
	}

}
