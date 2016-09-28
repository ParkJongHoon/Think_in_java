package org.uengine.Chap07.Interfaces.Interfaces_and_factories.games;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {return new Checkers();}
	
}
