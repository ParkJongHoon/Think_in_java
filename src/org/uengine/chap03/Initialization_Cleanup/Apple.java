package org.uengine.chap03.Initialization_Cleanup;

public class Apple {
	Apple getPeeled(){
		return Peeler.peel(this);
	}

}
