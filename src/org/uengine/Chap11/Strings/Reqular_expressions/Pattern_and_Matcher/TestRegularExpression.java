package org.uengine.Chap11.Strings.Reqular_expressions.Pattern_and_Matcher;
import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * �ۼ���: 2017-03-23
 * �ۼ���: ������
 * �ۼ�����: {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" } �϶�
 * �� Argument�� ���� �����
 * 
 * Pattern Class�� Matcher Class ���
 * 
 * Output:
Input: "abcabcabcdefabc"
Regular expression: "abcabcabcdefabc"
Match "abcabcabcdefabc" at positions 0-14
Regular expression: "abc+" <- �� ������ ��ġ ����
Match "abc" at positions 0-2
Match "abc" at positions 3-5
Match "abc" at positions 6-8
Match "abc" at positions 12-14
Regular expression: "(abc)+" <- abc�� ���ӿ� ���� ��ġ ���� �� abc�� ��ġ ����
Match "abcabcabc" at positions 0-8
Match "abc" at positions 12-14
Regular expression: "(abc){2,}"
Match "abcabcabc" at positions 0-8 abc�� ���ӿ� ���� ��ġ ���� ������ ���� ���ܽ�Ŵ
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
