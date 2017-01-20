package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_restrictions;

public abstract class Inning {
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk(){} // Throws no checked exceptions

}
