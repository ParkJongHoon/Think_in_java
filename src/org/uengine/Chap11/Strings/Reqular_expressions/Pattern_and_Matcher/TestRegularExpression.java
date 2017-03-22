package org.uengine.Chap11.Strings.Reqular_expressions.Pattern_and_Matcher;
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class TestRegularExpression {
	public static void main(String[] args) {
		if(args.length <2){
			print("Usage:\njava TestRegularExpression " +
				"characterSequence regularExpression+");
			System.exit(0);
		}
		print("Input: \"" + args[0] + "\"");
		for(String arg : args){
			print("Reqular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()){
				print("Match \"" + m.group() + "\" at positions" +
			m.start() + "-" + (m.end() - 1));
			}
		}
	}
}