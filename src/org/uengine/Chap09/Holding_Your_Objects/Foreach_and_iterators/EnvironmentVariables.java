package org.uengine.Chap09.Holding_Your_Objects.Foreach_and_iterators;

import java.util.Map;

public class EnvironmentVariables {

	/**
	 * �ۼ���: 2016-12-10
	 * �ۼ���: ������
	 * ����: ȯ�溯�� key�� value ������ �ͼ� ��� �����ִ� foreach��
	 * 
	 */
	public static void main(String[] args) {
		for(Map.Entry entry: System.getenv().entrySet()){
			System.out.println(entry.getKey() + ": " +
		entry.getValue());
		}

	}

}
