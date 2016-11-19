package org.uengine.Chap09.Holding_Your_Objects.Adding_groups_of_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {

	/**
	 * Arrays.asList() ���� ������
	 * List<Snow> snow1 = Arrays.asList(��ü, ��ü...);
	 * asList()�ȿ� ��ü�� ���� Snow Ŭ�����ų� Snow�� �ٷ� ��ӹ��� ��ü �� ������
	 * ���� Snow�� ��ӹ��� ��ü�� ��ӹ��� ��ü�� �� �ÿ� �ν��� ���� ���Ͽ� ������ ��
	 * Snow Ÿ���� �ν������� Powder Ÿ���� �ν����� ���� �׷���
	 * �̷� ���  ArrayList<Snow>��ü�� �ϳ� ������ ����
	 * Collections.addAll()��ü�� ���ڰ����� ArrayList�� ù��° ���������� �ְ�
	 * ������ Snow�� ��ӹ��� �Ƶ� �Ǵ� ����Ŭ������ ������ �����ϴ�
	 * �ٸ� ������δ� Arrays.asList�� ����
	 * asList�տ� <Ŭ���� Ÿ��>�� �����ϸ�ȴ�.
	 * -> Arrays.<Snow>asList()
	 * @param args
	 */
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
				
		// Won't compile:
		// List<Snow> snow2 = Arrays.asList(
		// new Light(), new Heavy());
		// Compiler says:
		// found : java.util.List<Powder>
		// required: java.util.List<Snow>
		// Collections. addAll() doesn't get confused:
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy(), new Crusty(), new Slush(), new Powder());
		
		
		// Give a hint using an
		// explicit type argument specification:
		List<Snow> snow4 = Arrays.<Snow>asList(new Crusty(), new Slush(), new Powder(), new Light(), new Heavy());

		
		System.out.println("-------------snow1---------------");
		System.out.println("snow1.size(): " + snow1.size());
		int count =0;
		for(Snow s: snow1){
			count ++;
			System.out.println( count + "��° ��ü: " + s.toString());
		}
		System.out.println("-------------/snow1---------------");
		System.out.println();
		System.out.println("-------------snow3---------------");
		System.out.println("snow3.size(): " + snow3.size());
		count =0;
		for(Snow s: snow3){
			count ++;
			System.out.println( count + "��° ��ü: " + s.toString());
		}
		System.out.println("-------------/snow3---------------");
		System.out.println();
		System.out.println("-------------snow4---------------");
		System.out.println("snow4.size(): " + snow4.size());
		count =0;
		for(Snow s: snow4){
			count ++;
			System.out.println( count + "��° ��ü: " + s.toString());
		}
		System.out.println("-------------/snow4---------------");
	}

}
