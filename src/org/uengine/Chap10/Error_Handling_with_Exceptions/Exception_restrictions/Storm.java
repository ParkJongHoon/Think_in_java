package org.uengine.Chap10.Error_Handling_with_Exceptions.Exception_restrictions;

public interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}
