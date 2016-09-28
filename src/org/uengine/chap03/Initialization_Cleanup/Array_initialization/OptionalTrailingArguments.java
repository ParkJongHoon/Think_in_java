package org.uengine.chap03.Initialization_Cleanup.Array_initialization;

	public class OptionalTrailingArguments {
		// String... 과 foreach문은 쌍으로 사용함
		static void f(int required, String... trailing){
			System.out.println("required: " + required + " ");
			for(String s: trailing){
				System.out.println( s + " ");
			}
			System.out.println();
		}
	
	public static void main(String[] args){
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}
	

}
