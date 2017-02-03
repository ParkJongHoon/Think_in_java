package org.uengine.Chap10.Error_Handling_with_Exceptions.Converting_checked_to_unchecked_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WrapCheckedException {
	void throwruntimeException(int type){
		try{
			switch(type){
			case 0: throw new FileNotFoundException();
			case 1: throw new IOException();
			case 2: throw new RuntimeException("Where am I?");
			default: return;
			}
			
		}catch(Exception e){ // Adapt to unchecked;
			System.out.println("TTTT");
			throw new RuntimeException(e);
		}
	}
}
