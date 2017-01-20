package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_matching;

public class Human {

	public static void main(String[] args) {
		// Catch the exact type:
		try{
			throw new Sneeze();
		}catch(Sneeze s){
			System.out.println("Caught Sneeze");
		}catch(Annoyance a){
			System.out.println("Caught Annoyance");
		}

	}

}
