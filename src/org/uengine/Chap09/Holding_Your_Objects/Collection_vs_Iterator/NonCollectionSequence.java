package org.uengine.Chap09.Holding_Your_Objects.Collection_vs_Iterator;

import java.util.Iterator;

import org.uengine.Type_Information.Pet;

public class NonCollectionSequence extends PetSequence {
	/**
	 * AbstractCollection�� ������� �ʰ� �ٸ� Ŭ������ �����
	 * ��� Collection Ŭ������ ����ϴ� ���
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
