package org.uengine.Chap09.Holding_Your_Objects.Generics_and_type_safe_containers;

import java.util.ArrayList;

public class AppleAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		/* �Ʒ��� ���� ArrayList�� ����ϸ� ��� ��üŸ���� �������� �ʾƼ�
		 * ArrayList��ü�� Ư�� �޼ҵ带 �����Ű�� �ڵ� ���Խ� ������
		 * �߻��� �� �ִٴ� ���� �����ִ� �ڵ�
		*/
		ArrayList apples = new ArrayList();
		for(int i =0; i<3; i++)
			apples.add(new Apple());
		//Not prevented from adding an Orange to apples:
		apples.add(new Orange());
		for(int i =0; i< apples.size(); i ++)
			// Orange ���� ��ü���� id��� �޼ҵ尡 ���µ� ����Ǿ �����߻�
			System.out.println(((Apple)apples.get(i)).id());
		// Orange is detected only at run time
	}

}
