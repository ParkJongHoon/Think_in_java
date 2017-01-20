package org.uengine.Chap10.Error_Handling_with_Exceptions.Constructors;

/**
 * �ۼ���: 2017-01-17
 * �ۼ���: ������
 * �ۼ�����: Ŭ���� �� ����� Ŭ���� �帧�� �и�
 * CleanupIdiom.class�� ���� �޼ҵ忡���� Ŭ���� �帧 ���õ� ���븸 �ۼ�
 *  ������� ������ �ش� Ŭ����(NeedsCleanup.class) �ȿ��� ������
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
