package org.uengine.Chap10.Error_Handling_with_Exceptions.Performing_cleanup_with_finally;

public class FinallyWorks {
	/**
	 * �ۼ���: 2017-01-12
	 * �ۼ���: ������
	 * �ۼ�����: try~ catch�������� finally Ȱ�뿡 ���� ����
	 * try~catch ������ ������ finally������ ź��.
	 */

	static int count = 0;
	public static void main(String[] args) {
		while(true){
			try{
				// Post-increment is zero first time;
				if(count++ == 0)
					throw new ThreeException();
			}catch(ThreeException e){
				System.out.println("catch, count: " + count);
				System.out.println("ThreeException");
			}finally{
				System.out.println("finally, count: " + count);
				System.out.println("In finally clause");
				if(count == 2) break; // out of "while"
			}
			
			
		}
		

	}

}
