package org.uengine.Chap09.Holding_Your_Objects.Collection_vs_Iterator;

import java.util.Iterator;

import org.uengine.Type_Information.Pet;

public class NonCollectionSequence extends PetSequence {
	/**
	 * AbstractCollection을 상속하지 않고 다른 클래스를 상속할
	 * 경우 Collection 클래스를 사용하는 방법
	 * @return
	 */
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			private int index = 0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public Pet next(){return pets[index++];}
			public void remove(){ // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args){
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
	}

}
