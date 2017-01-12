package org.uengine.Chap10.Error_Handling_with_Exceptions.Performing_cleanup_with_finally;

public class FinallyWorks {
	/**
	 * 작성일: 2017-01-12
	 * 작성자: 박종훈
	 * 작성내용: try~ catch문에서의 finally 활용에 대한 예시
	 * try~catch 문에서 무조건 finally내용을 탄다.
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
