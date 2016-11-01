package org.uengine.Chap08.Factory_Method_revisited;

public class Chess implements Game {
	
	private Chess(){}
	private int moves =0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
	public static GameFactory factory = new GameFactory() {	
		@Override
		public Game getGame() {
			return new Chess();
		}
	};

}
