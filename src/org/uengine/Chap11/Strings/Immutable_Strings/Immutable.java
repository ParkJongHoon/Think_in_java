package org.uengine.Chap11.Strings.Immutable_Strings;
import static net.mindview.util.Print.*;

public class Immutable {
	public static String upcase(String s){
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String q = "howdy";
		print(q);	// howdy
		String qq = upcase(q);
		print(qq); // HOWDY
		print(q); // howdy

	}

}
