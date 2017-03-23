package org.uengine.Chap11.Strings.Reqular_expressions.Pattern_and_Matcher;
import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 작성일: 2017-03-23
 * 작성자: 박종훈
 * 작성내용: {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" } 일때
 * 각 Argument에 따른 결과값
 * 
 * Pattern Class와 Matcher Class 사용
 * 
 * Output:
Input: "abcabcabcdefabc"
Regular expression: "abcabcabcdefabc"
Match "abcabcabcdefabc" at positions 0-14
Regular expression: "abc+" <- 각 패턴의 위치 주적
Match "abc" at positions 0-2
Match "abc" at positions 3-5
Match "abc" at positions 6-8
Match "abc" at positions 12-14
Regular expression: "(abc)+" <- abc의 연속에 대한 위치 추적 및 abc의 위치 추적
Match "abcabcabc" at positions 0-8
Match "abc" at positions 12-14
Regular expression: "(abc){2,}"
Match "abcabcabc" at positions 0-8 abc의 연속에 대한 위치 추적 끊어진 것은 제외시킴
 * @author XNote
 *
 */

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
				print("Match \"" + m.group() + "\" at positions " +
			m.start() + "-" + (m.end() - 1));
			}
		}
	}
}
