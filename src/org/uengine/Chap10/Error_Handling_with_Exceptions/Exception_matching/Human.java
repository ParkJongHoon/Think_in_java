package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_matching;

public class Human {
	
	/**
	 * �ۼ���: 2017-01-26
	 * �ۼ���: ������
	 * �ۼ�����: Exception matching
	 * 			- Exception�� ���� �� catch���� Exception ���� �б���
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
