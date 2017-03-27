package org.uengine.Chap11.Strings.Reqular_expressions.Reqular_expressions_and_Java_IO;

import java.util.regex.*;

import org.uengine.Type_Information.TextFile;

public class JGrep {

	public static void main(String[] args) throws Exception {
		if(args.length < 2){
			System.out.println("Usage: java JGrepfile regex");
			System.exit(0);
		}
		Pattern p = Pattern.compile(args[1]);
		// Iterate through the lines of the input file:
		int index =0;
		Matcher m = p.matcher("");
		for(String line : new TextFile(args[0])){
			m.reset(line);
			while(m.find())
				System.out.println(index++ + ": " +
			m.group() + ": " + m.start());
		}
	}
}
