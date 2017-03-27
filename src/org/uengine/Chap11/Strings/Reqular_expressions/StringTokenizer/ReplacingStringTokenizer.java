package org.uengine.Chap11.Strings.Reqular_expressions.StringTokenizer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {

	public static void main(String[] args) {
		String input = "But I'm not deadyet! I fell happy!";
		StringTokenizer stoke = new StringTokenizer(input);
		while(stoke.hasMoreElements())
			System.out.print(stoke.nextElement() + " ");
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(input.split(" ")));
		System.out.println();
		Scanner scanner = new Scanner(input);
		while(scanner.hasNext())
			System.out.print(scanner.next() + " ");
	}

}
