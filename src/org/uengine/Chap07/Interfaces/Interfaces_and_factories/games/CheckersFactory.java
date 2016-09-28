package org.uengine.Chap07.Interfaces.Interfaces_and_factories.games;

public class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {return new Chess();}
	
}
