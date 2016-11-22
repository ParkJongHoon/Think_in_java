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
    	// ArrayList는 입력한 순서대로 중복된 값으로 출력한다.
    	System.out.println(fill(new ArrayList<String>()));
    	// LinkedList는 입력한 순서대로 중복된 값으로 출력한다.
    	System.out.println(fill(new LinkedList<String>()));
    	
    	
    	// HashSet은 중복된 값을 삭제 후 나중 들어온 순서로 출력된다.
    	System.out.println(fill(new HashSet<String>()));
    	// TreeSet은 중복된 값을 삭제 후 첫번째 글자의 문자율 순서로 출력한다.
    	System.out.println(fill(new TreeSet<String>()));
    	// LinkedHasSet은 중복된 값을 삭제 후 먼저 들어온 순서로 출력한다.
    	System.out.println(fill(new LinkedHashSet<String>()));
    	
    	
    	// HashMap은 중복된 값을 삭제 후 나중들은 순서로 Key와 Value를 출력한다.
    	System.out.println(fill(new HashMap<String, String>()));
    	// TreeMap은 중복된 값을 삭제 후 첫번째 글자의 문자율 순서로 Key와 Value값을 출력한다.
    	System.out.println(fill(new TreeMap<String, String>()));
    	// LinkedHasMap은 중복된 값을 삭제 후 들어온 순서대로 출력한다.
    	System.out.println(fill(new LinkedHashMap<String, String>()));
    }
	
}
