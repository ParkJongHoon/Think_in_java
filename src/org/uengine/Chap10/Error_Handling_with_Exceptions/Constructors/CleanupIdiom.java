package org.uengine.Chap10.Error_Handling_with_Exceptions.Constructors;

/**
 * 작성일: 2017-01-17
 * 작성자: 박종훈
 * 작성내용: 클래스 상세 내용과 클래스 흐름의 분리
 * CleanupIdiom.class의 메인 메소드에서는 클래스 흐름 관련된 내용만 작성
 *  기능적인 내용은 해당 클래스(NeedsCleanup.class) 안에서 구현함
 *
 */

public class CleanupIdiom {

	public static void main(String[] args) {
		// Section 1:
		NeedsCleanup nc1 = new NeedsCleanup();
		try{
			
		}finally{
			nc1.dispose();
		}
		
		// Section 2:
		// If construction cannot fail you can group objects:
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try{
			
		}finally{
			nc3.dispose(); // Reverse order of construction
			nc2.dispose();
		}
		
		// Section 3:
		// If construction can fail you must guard each one:
		try{
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try{
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try{
					// ...
				}finally{
					nc5.dispose();
				}
			}catch(ConstructionException e){ // nc5 constructor
				System.out.println(e);
			}finally{
				nc4.dispose();
			}
			
		} catch(ConstructionException e){
			System.out.println(e);
		}
		

	}

}
