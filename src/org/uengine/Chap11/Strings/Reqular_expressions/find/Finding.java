package org.uengine.Chap11.Strings.Reqular_expressions.find;

import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 작성일: 2017-03-23
 * 작성자: 박종훈
 * 작성내용: java.util.regex의 Pattern과 Matcher 사용
 * 			- find() 메소드 사용
 *          1) Pattern의 정의 -> Pattern.complie("패턴내용")
 *          2) Matcher의 객체 m에 패턴내용과 matcher()내용을 주입시킴
 *          3) m.find()를 하면 패턴내용에 입력된 결과에 따른 true or false가 결정됨과 동시에
 *             m.group()의 값도 결정됨 
 * 
 *
 */

public class Finding {

	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+")
				.matcher("Evening is full of the linnet's wings");
		while(m.find())
			printnb(m.group() + " ");
		print();
		int i = 0;
		while(m.find(i)){
			printnb(m.group() + " ");
			System.out.print(i);
			i++;
		}

	}

}
