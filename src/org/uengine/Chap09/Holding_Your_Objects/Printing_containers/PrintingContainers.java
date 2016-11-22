package org.uengine.Chap09.Holding_Your_Objects.Printing_containers;

import java.util.*;
public class PrintingContainers {
	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map fill (Map<String, String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Bosco");
		return map;
	}
    public static void main(String[] args){
    	// ArrayList�� �Է��� ������� �ߺ��� ������ ����Ѵ�.
    	System.out.println(fill(new ArrayList<String>()));
    	// LinkedList�� �Է��� ������� �ߺ��� ������ ����Ѵ�.
    	System.out.println(fill(new LinkedList<String>()));
    	
    	
    	// HashSet�� �ߺ��� ���� ���� �� ���� ���� ������ ��µȴ�.
    	System.out.println(fill(new HashSet<String>()));
    	// TreeSet�� �ߺ��� ���� ���� �� ù��° ������ ������ ������ ����Ѵ�.
    	System.out.println(fill(new TreeSet<String>()));
    	// LinkedHasSet�� �ߺ��� ���� ���� �� ���� ���� ������ ����Ѵ�.
    	System.out.println(fill(new LinkedHashSet<String>()));
    	
    	
    	// HashMap�� �ߺ��� ���� ���� �� ���ߵ��� ������ Key�� Value�� ����Ѵ�.
    	System.out.println(fill(new HashMap<String, String>()));
    	// TreeMap�� �ߺ��� ���� ���� �� ù��° ������ ������ ������ Key�� Value���� ����Ѵ�.
    	System.out.println(fill(new TreeMap<String, String>()));
    	// LinkedHasMap�� �ߺ��� ���� ���� �� ���� ������� ����Ѵ�.
    	System.out.println(fill(new LinkedHashMap<String, String>()));
    }
	
}
