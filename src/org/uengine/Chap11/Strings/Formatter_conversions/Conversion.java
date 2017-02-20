package org.uengine.Chap11.Strings.Formatter_conversions;

import java.math.BigInteger;
import java.util.Formatter;
/**
 * 작성일: 2017-02-20
 * 작성자: 박종훈
 * 작성내용:
 * 	d -> Integral(as decimal)
 *  c -> Unicode character
 *  b -> Boolean value
 *  s -> String
 *  f -> Floating point (as decimal)
 *  e -> Floating  point (in scientific notation)
 *  x -> Integral (as hex)
 *  h -> Hash code (as hex)
 *  % -> Literal "%"
 *  
 *  String을 출력하는 형태
 * @author XNote
 *
 */
public class Conversion {
	public static void main(String[] args) {
		Formatter f = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = 'a'");
		f.format("s: %s\n", u);
		// s -> String
		// f.format("d: %d\n", u);
		f.format("c: %c\n", u);
		// c -> Unicode character
		f.format("b: %b\n", u);
		// b -> Boolean value
		// f.format("f: %f\n",  u);
		// f -> Floating point(as decimal)
		// f.format("e: %e\n",  u);
		// f.format("x: %x\n",  u);
		f.format("h: %h\n", u);
		
		int v = 121;
		System.out.println("v = 121");
		f.format("d: %d\n", v);
		f.format("c: %c\n", v);
		f.format("b: %b\n", v);
		f.format("s: %s\n", v);
		// f.format("f: %f\n", v);
		// f.format("e: %e\n", v);
		f.format("x: %x\n", v);
		f.format("h: %h\n", v);
		
		BigInteger w = new BigInteger("50000000000000");
		System.out.println("w = new BigInteger(\"50000000000000\")");
		
		f.format("d: %d\n", w);
		// f.format("c: %c\n", w);
		f.format("b: %b\n", w);
		f.format("s: %s\n", w);
		// f.format("f: %f\n", w);
		// f.format("e: %e\n", w);
		f.format("x: %x\n", w);
		f.format("h: %h\n", w);
		
		double x = 179.543;
		System.out.println("x = 179.543");
		// f.format("d: %d\n", x);
		// f.format("c: %c\n", x);
		f.format("b: %b\n", x);
		f.format("s: %s\n", x);
		f.format("f: %f\n", x);
		f.format("e: %e\n", x);
		// f.format("x: %x\n", x);
		f.format("h: %h\n", x);
		
		Conversion y = new Conversion();
		System.out.println("y = new Conversion()");
		// f.format("d: %d\n", y);
		// f.format("c: %c\n", y);
		f.format("b: %b\n", y);
		f.format("s: %s\n", y);
		// f.format("f: %f\n", y);
		// f.format("e: %e\n", y);
		// f.format("x: %x\n", y);
		f.format("h: %h\n", y);
		
		boolean z = false;
		System.out.println("z = false");
		// f.format("d: %d\n", z);
		// f.format("c: %c\n", z);
		f.format("b: %b\n", z);
		f.format("s: %s\n", z);
		// f.format("s: %s\n", z);
		// f.format("s: %s\n", z);
		// f.format("s: %s\n", z);
		f.format("h: %h\n", z);
	}

}
