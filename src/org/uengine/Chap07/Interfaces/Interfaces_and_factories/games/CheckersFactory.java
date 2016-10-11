package org.uengine.Chap07.Interfaces.Interfaces_and_factories.games;

public class CheckersFactory implements GameFactory {

	public Game getGame() {return new Chess();}
	
}
