package org.uengine.chap03.Initialization_Cleanup.static_data_intialization;


public class Table {
	static Bowl bowl1 = new Bowl(1);
	public Table() {
	System.out.println("Table()");
	}
	void f2(int marker){
		System.out.println("f2(" + marker + ")");
	}
	static Bowl bowl2 = new Bowl(2);
}
