package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_matching;

public class Human {
	
	/**
	 * 작성일: 2017-01-26
	 * 작성자: 박종훈
	 * 작성내용: Exception matching
	 * 			- Exception을 던질 때 catch에서 Exception 조건 분기함
	 * @param args
	 */

	public static void main(String[] args) {
		// Catch the exact type:
		try{
			//throw new Annoyance();
			throw new Sneeze();
		}catch(Sneeze s){
			System.out.println("Caught Sneeze");
		}catch(Annoyance a){
			System.out.println("Caught Annoyance");
		}

	}

}
