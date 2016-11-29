package org.uengine.Chap09.Holding_Your_Objects.Collection_vs_Iterator;

import java.util.AbstractCollection;
import java.util.Iterator;

import org.uengine.Type_Information.Pet;
import org.uengine.Type_Information.Pets;

public class CollectionSequence extends AbstractCollection<Pet> {
	/**
	 * Collection 객체를 직접 상속받아서 쓰고 싶다면 예제
	 * AbstractCollection을 상속받아서 쓰는 Case
	 */
	private Pet[] pets = Pets.createArray(8);
	@Override
	public int size() {return pets.length;}

	@Override
	public Iterator<Pet> iterator() {
		
		return new Iterator<Pet>() {
			private int index   =0;
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
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
}
