package org.uengine.Chap11.Strings.Reqular_expressions.Replace_operations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.*;
import static net.mindview.util.Print.*;

import org.uengine.Chap11.Strings.format.Hex;
import org.uengine.Type_Information.TextFile;

public class TheReplacements {

	public static void main(String[] args) throws Exception {
		String s = TextFile.read(TheReplacements.class.getResource("").getPath()+"TheReplacements.java");
		// Match the specially commented block of text above:
		Matcher mInput = 
				Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
		if(mInput.find())
			s = mInput.group(1);	// Captured by parentheses
		// Replace two or more spaces with a single space
		s = s.replaceAll("{2,}", " ");
		// Replace one or more spaces at the beginning of each
		// line with no spaces. Must enable MULTILINE mode:
		s = s.replaceAll("(?m)^ +", "");
		print(s);
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer sbuf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		// Process the find information as you
		// perform the replacements:
		while(m.find())
			m.appendReplacement(sbuf, m.group().toLowerCase());
		// Put in the remainder of the text:
		m.appendTail(sbuf);
		print(sbuf);
		
		
	}

}
