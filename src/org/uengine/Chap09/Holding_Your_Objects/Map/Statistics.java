package org.uengine.Chap09.Holding_Your_Objects.Map;

import java.util.*;

public class Statistics {
	/**
	 * key�� value�� �̿��� ����
	 * 1. Random api�� �̿��Ͽ� 0~19���� value���� �����޴´�(10000��)
	 * 2. �̶� �ش� value���� �̿��Ͽ� map���� �ش� ���� �����Ѵ�.
	 * 3. ���� ��ϵǾ� ���� ���� ���̹Ƿ� null�� �����޴´�.
	 * 4. m.put���� ���� m.put(r, freq == null? 1: freq + 1);
	 * �Ŀ��� m�� �ش� Ű��  value������ ����ϰ� value���� value�� null�� 
	 * Integer�� �Է��ϹǷ� Integer ��ü���� 1�� value������ ���� �ȴ�.
	 * �׸��� ���� �ش� ���� �����ϰ� ������ �� Integer�� value���� 1�� �����ϰ� �ȴ�.
	 * 5. �̸� �����ϱ� ���ؼ� m�ȿ� �ִ� �� Ű�� ������ Integer�� �����Ͽ� �ش� value
	 * ���� sum���� ���ϰ� �Ǹ� 10000���̶�� ����� ���´�.
	 * 
	 * 
	 * �ָ��ؾ� �� �޼ҵ�: 	m.put(r,  freq == null? 1: freq + 1);
	 * @param args
	 */
	public static void main(String[] args){
		Random rand = new Random(47);
		Map<Integer, Integer> m =
				new HashMap<Integer, Integer>();
		
		int index = 0;
		int sum =0;
		for(int i =0; i < 10000; i++){
			// Produce a number  between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r,  freq == null? 1: freq + 1);
			index = i;
		}
		
		System.out.println(m);
		for(int j =0; j<m.size(); j++){
		Integer container =	m.get(j);
		sum = sum + container.intValue();
		}
		System.out.println("sum: " +sum);
	}
}
