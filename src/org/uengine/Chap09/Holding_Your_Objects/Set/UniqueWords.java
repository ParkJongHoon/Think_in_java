package org.uengine.Chap09.Holding_Your_Objects.Set;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

import org.uengine.Type_Information.TextFile;

public class UniqueWords {
	public static void main(String[] args) {
		   //File path = new File(".");
		    //System.out.println(path.getAbsolutePath()); 
		
		//현재클래스명.class.getResource("").getPath();
		String path = UniqueWords.class.getResource("").getPath();
		System.out.println(path);
		int index = path.indexOf("org");
		System.out.println("index: " + index);
		path = path.substring(index);
		System.out.println("editedPath: " + path);
		path = "src\\" + path;
		System.out.println("editedPath2: " + path);
		//File path = new File(".");
		//System.out.println(path.getAbsolutePath());
		Set<String> words = new TreeSet<String>(
				new TextFile(path+"SetOperations.java", "\\W+"));
		System.out.println(words);
	}

}
