package org.uengine.Chap09.Holding_Your_Objects.The_Adapter_Method_idiom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c){super(c);}
	public Iterable<T> reversed() {
		return new Iterable<T>(){
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current = size() - 1;
					public boolean hasNext(){return current > -1;}
					public T next(){return get(current--);}
					public void remove(){ // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
			
		};
	}

}
