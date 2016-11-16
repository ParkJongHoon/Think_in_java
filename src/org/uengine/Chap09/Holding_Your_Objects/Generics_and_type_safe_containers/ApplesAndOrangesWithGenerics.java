package org.uengine.Chap09.Holding_Your_Objects.Generics_and_type_safe_containers;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		// ArrayList��  ���� ���� ��ü ���� ����
		ArrayList<Apple> apples = new ArrayList<Apple>();
		// ArrayList��  ��ü ����
		for(int i =0; i < 3; i++)
			apples.add(new Apple());
		
		// ArrayList���� ������ ��� �ΰ���
		// 1. �Ϲ� for��
		for(int i =0; i< apples.size(); i++)
			System.out.println(apples.get(i).id());
		// 2. forEach��
		for(Apple c : apples)
			System.out.println(c.id());

	}

}
